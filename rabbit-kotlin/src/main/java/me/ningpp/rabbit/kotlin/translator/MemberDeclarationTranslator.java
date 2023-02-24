package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.MemberDeclarationInfo;

public class MemberDeclarationTranslator implements Translator<MemberDeclarationInfo, KotlinNamedItem> {

    private static final MemberDeclarationTranslator INSTANCE = new MemberDeclarationTranslator();

    public static MemberDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, MemberDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<KotlinNamedItem> namedItems = new ArrayList<>();

        namedItems.addAll(FieldDeclarationTranslator.getInstance()
                .translate(fileName, source.getFieldDeclarationInfo(), context));

        namedItems.addAll(ConstructorDeclarationTranslator.getInstance()
                .translate(fileName, source.getConstructorDeclarationInfo(), context));

        namedItems.addAll(MethodDeclarationTranslator.getInstance()
                .translate(fileName, source.getMethodDeclarationInfo(), context));

        namedItems.addAll(OperatorDeclarationTranslator.getInstance()
                .translate(fileName, source.getOperatorDeclarationInfo(), context));

        namedItems.addAll(IndexerDeclarationTranslator.getInstance()
                .translate(fileName, source.getIndexerDeclarationInfo(), context));

        namedItems.addAll(PropertyDeclarationTranslator.getInstance()
                .translate(fileName, source.getPropertyDeclarationInfo(), context));

        namedItems.addAll(DelegateDeclarationTranslator.getInstance()
                .translate(fileName, source.getDelegateDeclarationInfo(), context));

        namedItems.addAll(NamespaceDeclarationTranslator.getInstance()
                .translate(fileName, source.getNamespaceDeclarationInfo(), context));

        namedItems.addAll(RecordDeclarationTranslator.getInstance()
                .translate(fileName, source.getRecordDeclarationInfo(), context));

        namedItems.addAll(ClassDeclarationTranslator.getInstance()
                .translate(fileName, source.getClassDeclarationInfo(), context));

        namedItems.addAll(StructDeclarationTranslator.getInstance()
                .translate(fileName, source.getStructDeclarationInfo(), context));

        namedItems.addAll(InterfaceDeclarationTranslator.getInstance()
                .translate(fileName, source.getInterfaceDeclarationInfo(), context));

        namedItems.addAll(EnumDeclarationTranslator.getInstance()
                .translate(fileName, source.getEnumDeclarationInfo(), context));
        return namedItems;
    }
}
