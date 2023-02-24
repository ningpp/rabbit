package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ExpressionStatementInfo;

public class ExpressionStatementTranslator implements Translator<ExpressionStatementInfo, String> {

    private static final ExpressionStatementTranslator INSTANCE = new ExpressionStatementTranslator();

    public static ExpressionStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ExpressionStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return ExpressionTranslator.getInstance().translate(fileName, source.getExpression(), context);
    }

}
