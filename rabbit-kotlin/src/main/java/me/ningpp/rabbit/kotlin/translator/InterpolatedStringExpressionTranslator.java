package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.InterpolatedStringExpressionInfo;

public class InterpolatedStringExpressionTranslator implements Translator<InterpolatedStringExpressionInfo, String> {

    private static final InterpolatedStringExpressionTranslator INSTANCE = new InterpolatedStringExpressionTranslator();

    public static InterpolatedStringExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, InterpolatedStringExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
