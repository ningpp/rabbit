package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ImplicitStackAllocArrayCreationExpressionInfo;

public class ImplicitStackAllocArrayCreationExpressionTranslator implements Translator<ImplicitStackAllocArrayCreationExpressionInfo, String> {

    private static final ImplicitStackAllocArrayCreationExpressionTranslator INSTANCE = new ImplicitStackAllocArrayCreationExpressionTranslator();

    public static ImplicitStackAllocArrayCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ImplicitStackAllocArrayCreationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
