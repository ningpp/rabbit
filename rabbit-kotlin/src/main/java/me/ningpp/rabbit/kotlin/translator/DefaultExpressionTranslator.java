package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.DefaultExpressionInfo;

public class DefaultExpressionTranslator implements Translator<DefaultExpressionInfo, String> {

    private static final DefaultExpressionTranslator INSTANCE = new DefaultExpressionTranslator();

    public static DefaultExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, DefaultExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
