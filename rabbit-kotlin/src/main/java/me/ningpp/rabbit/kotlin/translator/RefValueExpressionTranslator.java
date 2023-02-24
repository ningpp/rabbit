package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.RefValueExpressionInfo;

public class RefValueExpressionTranslator implements Translator<RefValueExpressionInfo, String> {

    private static final RefValueExpressionTranslator INSTANCE = new RefValueExpressionTranslator();

    public static RefValueExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, RefValueExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
