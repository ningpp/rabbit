package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.StructDeclarationInfo;

public class StructDeclarationTranslator implements Translator<StructDeclarationInfo, KotlinNamedItem> {

    private static final StructDeclarationTranslator INSTANCE = new StructDeclarationTranslator();

    public static StructDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, StructDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of();
    }
}
