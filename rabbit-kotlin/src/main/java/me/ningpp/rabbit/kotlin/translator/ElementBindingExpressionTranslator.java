package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ElementBindingExpressionInfo;

public class ElementBindingExpressionTranslator implements Translator<ElementBindingExpressionInfo, String> {

    private static final ElementBindingExpressionTranslator INSTANCE = new ElementBindingExpressionTranslator();

    public static ElementBindingExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ElementBindingExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
