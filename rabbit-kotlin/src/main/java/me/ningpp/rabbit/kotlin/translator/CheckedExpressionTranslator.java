package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.CheckedExpressionInfo;

public class CheckedExpressionTranslator implements Translator<CheckedExpressionInfo, String> {

    private static final CheckedExpressionTranslator INSTANCE = new CheckedExpressionTranslator();

    public static CheckedExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, CheckedExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
