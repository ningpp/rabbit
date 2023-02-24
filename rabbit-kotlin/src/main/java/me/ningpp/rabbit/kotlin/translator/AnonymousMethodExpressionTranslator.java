package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.AnonymousMethodExpressionInfo;

public class AnonymousMethodExpressionTranslator implements Translator<AnonymousMethodExpressionInfo, String> {

    private static final AnonymousMethodExpressionTranslator INSTANCE = new AnonymousMethodExpressionTranslator();

    public static AnonymousMethodExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, AnonymousMethodExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
