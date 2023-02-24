package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.AwaitExpressionInfo;

public class AwaitExpressionTranslator implements Translator<AwaitExpressionInfo, String> {

    private static final AwaitExpressionTranslator INSTANCE = new AwaitExpressionTranslator();

    public static AwaitExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, AwaitExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
