package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.WhileStatementInfo;

public class WhileStatementTranslator implements Translator<WhileStatementInfo, String> {

    private static final WhileStatementTranslator INSTANCE = new WhileStatementTranslator();

    public static WhileStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, WhileStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> conditions = ExpressionTranslator.getInstance()
                .translate(fileName, source.getCondition(), context);

        String formatWhile;
        boolean appendWhileEnd = false;
        if (source.getStatement() != null && source.getStatement().getBlockInfo() != null) {
            formatWhile = "while (%s)";
        } else {
            formatWhile = "while (%s) {";
            appendWhileEnd = true;
        }

        List<String> lines = new ArrayList<>();
        if (!conditions.isEmpty()) {
            lines.add(String.format(Locale.ROOT,
                    formatWhile, String.join("", conditions)));
        }
        lines.addAll(StatementTranslator
                .getInstance().translate(fileName,
                        source.getStatement(), context));

        if (appendWhileEnd) {
            lines.add("}");
        }
        return lines;
    }

}
