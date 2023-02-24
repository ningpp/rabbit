package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.InitializerExpressionInfo;

public class InitializerExpressionTranslator implements Translator<InitializerExpressionInfo, String> {

    private static final InitializerExpressionTranslator INSTANCE = new InitializerExpressionTranslator();

    public static InitializerExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, InitializerExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
