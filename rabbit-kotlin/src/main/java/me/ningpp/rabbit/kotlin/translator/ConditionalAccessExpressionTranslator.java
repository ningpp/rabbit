package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ConditionalAccessExpressionInfo;

public class ConditionalAccessExpressionTranslator implements Translator<ConditionalAccessExpressionInfo, String> {

    private static final ConditionalAccessExpressionTranslator INSTANCE = new ConditionalAccessExpressionTranslator();

    public static ConditionalAccessExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ConditionalAccessExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
