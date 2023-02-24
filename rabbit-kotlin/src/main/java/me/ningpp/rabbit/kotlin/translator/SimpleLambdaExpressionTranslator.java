package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.SimpleLambdaExpressionInfo;

public class SimpleLambdaExpressionTranslator implements Translator<SimpleLambdaExpressionInfo, String> {

    private static final SimpleLambdaExpressionTranslator INSTANCE = new SimpleLambdaExpressionTranslator();

    public static SimpleLambdaExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, SimpleLambdaExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
