package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ImplicitObjectCreationExpressionInfo;

public class ImplicitObjectCreationExpressionTranslator implements Translator<ImplicitObjectCreationExpressionInfo, String> {

    private static final ImplicitObjectCreationExpressionTranslator INSTANCE = new ImplicitObjectCreationExpressionTranslator();

    public static ImplicitObjectCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ImplicitObjectCreationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
