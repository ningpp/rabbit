package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.AliasQualifiedNameInfo;

public class AliasQualifiedNameTranslator implements Translator<AliasQualifiedNameInfo, String> {

    private static final AliasQualifiedNameTranslator INSTANCE = new AliasQualifiedNameTranslator();

    public static AliasQualifiedNameTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, AliasQualifiedNameInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of();
    }
}
