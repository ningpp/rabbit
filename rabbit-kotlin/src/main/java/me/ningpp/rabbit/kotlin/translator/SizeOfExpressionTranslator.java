package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.exception.UnsupportedSyntaxException;
import me.ningpp.rabbit.model.SizeOfExpressionInfo;

public class SizeOfExpressionTranslator implements Translator<SizeOfExpressionInfo, String> {

    private static final SizeOfExpressionTranslator INSTANCE = new SizeOfExpressionTranslator();

    public static SizeOfExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, SizeOfExpressionInfo source, TranslateContext context) {
        if (source != null && context.isThrowUnsupportedSyntaxException()) {
            throw new UnsupportedSyntaxException();
        }
        return List.of();
    }

}
