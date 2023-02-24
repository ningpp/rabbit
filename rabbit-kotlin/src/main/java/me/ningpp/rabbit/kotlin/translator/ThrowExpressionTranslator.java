package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ThrowExpressionInfo;

public class ThrowExpressionTranslator implements Translator<ThrowExpressionInfo, String> {

    private static final ThrowExpressionTranslator INSTANCE = new ThrowExpressionTranslator();

    public static ThrowExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ThrowExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
