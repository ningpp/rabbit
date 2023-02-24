package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.RecordDeclarationInfo;

public class RecordDeclarationTranslator implements Translator<RecordDeclarationInfo, KotlinNamedItem> {

    private static final RecordDeclarationTranslator INSTANCE = new RecordDeclarationTranslator();

    public static RecordDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, RecordDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of();
    }
}
