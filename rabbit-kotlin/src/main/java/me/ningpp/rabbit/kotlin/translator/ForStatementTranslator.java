package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ExpressionInfo;
import me.ningpp.rabbit.model.ForStatementInfo;

public class ForStatementTranslator implements Translator<ForStatementInfo, String> {

    private static final ForStatementTranslator INSTANCE = new ForStatementTranslator();

    public static ForStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ForStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        //TODO for (int i=1;i<10;i++) { xxx; } int i = 2; and others??
        List<String> lines = new ArrayList<>();
        lines.addAll(VariableDeclarationTranslator.getInstance().translate(
                fileName, source.getDeclaration(), context
        ));
        lines.addAll(ExpressionTranslator.getInstance().translate(
                fileName, source.getInitializers(), context
        ));

        lines.add(String.format(Locale.ROOT,
                "while(%s) {",
                String.join("", ExpressionTranslator.getInstance().translate(
                        fileName, source.getCondition(), context
                ))));

        lines.addAll(StatementTranslator.getInstance()
                .translateWithBrace(false, fileName, source.getStatement(), context));

        //must in last
        lines.addAll(ExpressionTranslator.getInstance().translate(
                fileName, source.getIncrementors(), context
        ));
        lines.add("}");

        return lines;
    }

}
