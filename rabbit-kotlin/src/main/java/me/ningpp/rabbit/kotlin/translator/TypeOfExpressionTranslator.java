package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.TypeOfExpressionInfo;

public class TypeOfExpressionTranslator implements Translator<TypeOfExpressionInfo, String> {

    private static final TypeOfExpressionTranslator INSTANCE = new TypeOfExpressionTranslator();

    public static TypeOfExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, TypeOfExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
