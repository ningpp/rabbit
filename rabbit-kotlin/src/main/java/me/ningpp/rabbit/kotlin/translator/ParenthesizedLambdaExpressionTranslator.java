package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ParenthesizedLambdaExpressionInfo;

public class ParenthesizedLambdaExpressionTranslator implements Translator<ParenthesizedLambdaExpressionInfo, String> {

    private static final ParenthesizedLambdaExpressionTranslator INSTANCE = new ParenthesizedLambdaExpressionTranslator();

    public static ParenthesizedLambdaExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ParenthesizedLambdaExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
