package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.AnonymousObjectCreationExpressionInfo;

public class AnonymousObjectCreationExpressionTranslator implements Translator<AnonymousObjectCreationExpressionInfo, String> {

    private static final AnonymousObjectCreationExpressionTranslator INSTANCE = new AnonymousObjectCreationExpressionTranslator();

    public static AnonymousObjectCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, AnonymousObjectCreationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
