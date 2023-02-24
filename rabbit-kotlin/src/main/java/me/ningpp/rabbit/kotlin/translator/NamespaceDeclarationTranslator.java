package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.NamespaceDeclarationInfo;

public class NamespaceDeclarationTranslator implements Translator<NamespaceDeclarationInfo, KotlinNamedItem> {

    private static final NamespaceDeclarationTranslator INSTANCE = new NamespaceDeclarationTranslator();

    public static NamespaceDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName,
                            NamespaceDeclarationInfo namespaceDeclarationInfo,
                            TranslateContext context) {
        if (namespaceDeclarationInfo == null
            || namespaceDeclarationInfo.getMembers() == null) {
            return List.of();
        }
        List<KotlinNamedItem> taggables = new ArrayList<>();
        for (var member : namespaceDeclarationInfo.getMembers()) {
            taggables.addAll(MemberDeclarationTranslator.getInstance()
                    .translate(fileName, member, context));
        }
        return taggables;
    }
}
