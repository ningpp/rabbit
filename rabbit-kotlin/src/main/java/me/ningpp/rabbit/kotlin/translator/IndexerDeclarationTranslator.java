package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.IndexerDeclarationInfo;

public class IndexerDeclarationTranslator implements Translator<IndexerDeclarationInfo, KotlinNamedItem> {

    private static final IndexerDeclarationTranslator INSTANCE = new IndexerDeclarationTranslator();

    public static IndexerDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, IndexerDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of();
    }
}
