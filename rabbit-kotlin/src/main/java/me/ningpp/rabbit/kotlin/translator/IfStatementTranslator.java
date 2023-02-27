package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.IfStatementInfo;

public class IfStatementTranslator implements Translator<IfStatementInfo, String> {

    private static final IfStatementTranslator INSTANCE = new IfStatementTranslator();

    public static IfStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, IfStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();

        //TODO force add {}
        String formatIf;
        boolean appendIfEnd = false;
        if (source.getStatement() != null && source.getStatement().getBlockInfo() != null) {
            formatIf = "if (%s)";
        } else {
            formatIf = "if (%s) {";
            appendIfEnd = true;
        }
        lines.add(String.format(Locale.ROOT,
                formatIf,
                String.join("",
                        ExpressionTranslator.getInstance().translate(
                                fileName, source.getCondition(), context
                        ))));

        lines.addAll(StatementTranslator.getInstance().translate(
                fileName, source.getStatement(), context
        ));

        String formatElse;
        if (source.getElseInfo() != null) {
            boolean appendElseEnd = false;
            if (source.getStatement() != null && source.getStatement().getBlockInfo() != null) {
                formatElse = "else";
            } else {
                var elseStmt = source.getElseInfo().getStatement();
                formatElse = "} else";
                if (elseStmt != null) {
                    if (elseStmt.getIfStatementInfo() == null
                        || elseStmt.getBlockInfo() == null) {
                        formatElse = "} else {";
                        appendElseEnd = true;
                    }
                }
            }

            lines.add(formatElse);
            lines.addAll(StatementTranslator.getInstance().translate(
                    fileName, source.getElseInfo().getStatement(), context
            ));
            if (appendElseEnd) {
                lines.add("}");
            }
        } else if (appendIfEnd) {
            lines.add("}");
        }

        return lines;
    }

}
