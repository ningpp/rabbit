package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.DeclarationExpressionInfo;

public class DeclarationExpressionTranslator implements Translator<DeclarationExpressionInfo, String> {

    private static final DeclarationExpressionTranslator INSTANCE = new DeclarationExpressionTranslator();

    public static DeclarationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, DeclarationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
