package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.exception.UnsupportedSyntaxException;
import me.ningpp.rabbit.model.StackAllocArrayCreationExpressionInfo;

public class StackAllocArrayCreationExpressionTranslator implements Translator<StackAllocArrayCreationExpressionInfo, String> {

    private static final StackAllocArrayCreationExpressionTranslator INSTANCE = new StackAllocArrayCreationExpressionTranslator();

    public static StackAllocArrayCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, StackAllocArrayCreationExpressionInfo source, TranslateContext context) {
        if (source != null && context.isThrowUnsupportedSyntaxException()) {
            throw new UnsupportedSyntaxException();
        }
        return List.of();
    }

}
