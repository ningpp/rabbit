package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.TypeArgumentListInfo;

public class TypeArgumentListTranslator implements Translator<TypeArgumentListInfo, String> {

    private static final TypeArgumentListTranslator INSTANCE = new TypeArgumentListTranslator();

    public static TypeArgumentListTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, TypeArgumentListInfo source, TranslateContext context) {
        if (source == null || source.getArguments() == null) {
            return List.of();
        }
        return source.getArguments().stream().map(typeInfo ->
                TypeInfoTranlator.translate(typeInfo, context))
                .filter(StringUtils::isNotEmpty).toList();
    }
}
