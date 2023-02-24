package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.SimpleBaseTypeInfo;

public class SimpleBaseTypeTranslator implements Translator<SimpleBaseTypeInfo, String> {

    private static final SimpleBaseTypeTranslator INSTANCE = new SimpleBaseTypeTranslator();

    public static SimpleBaseTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, SimpleBaseTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(TypeInfoTranlator.translate(source.getType(), context));
    }
}
