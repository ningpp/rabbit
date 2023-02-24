package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ImplicitArrayCreationExpressionInfo;

public class ImplicitArrayCreationExpressionTranslator implements Translator<ImplicitArrayCreationExpressionInfo, String> {

    private static final ImplicitArrayCreationExpressionTranslator INSTANCE = new ImplicitArrayCreationExpressionTranslator();

    public static ImplicitArrayCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ImplicitArrayCreationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
