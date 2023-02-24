package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ReturnStatementInfo;

public class ReturnStatementTranslator implements Translator<ReturnStatementInfo, String> {

    private static final ReturnStatementTranslator INSTANCE = new ReturnStatementTranslator();

    public static ReturnStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ReturnStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines;
        if (source.getExpression() == null) {
            lines = List.of("return");
        } else {
            lines = List.of("return " +
                     String.join("", ExpressionTranslator.getInstance().translate(
                             fileName, source.getExpression(), context
                     )));
        }
        return lines;
    }

}
