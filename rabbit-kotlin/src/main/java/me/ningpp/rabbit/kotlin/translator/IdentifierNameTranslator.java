package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.IdentifierNameInfo;

public class IdentifierNameTranslator implements Translator<IdentifierNameInfo, String> {

    private static final IdentifierNameTranslator INSTANCE = new IdentifierNameTranslator();

    public static IdentifierNameTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, IdentifierNameInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(source.getIdentifier());
    }
}
