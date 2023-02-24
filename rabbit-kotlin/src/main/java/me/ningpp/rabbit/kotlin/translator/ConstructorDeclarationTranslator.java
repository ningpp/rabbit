package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ConstructorDeclarationInfo;

public class ConstructorDeclarationTranslator implements Translator<ConstructorDeclarationInfo, KotlinNamedItem> {

    private static final ConstructorDeclarationTranslator INSTANCE = new ConstructorDeclarationTranslator();

    public static ConstructorDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, ConstructorDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of();
    }
}
