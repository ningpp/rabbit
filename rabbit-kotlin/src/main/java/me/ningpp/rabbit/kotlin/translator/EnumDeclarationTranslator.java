package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinType;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.EnumDeclarationInfo;

public class EnumDeclarationTranslator implements Translator<EnumDeclarationInfo, KotlinNamedItem> {

    private static final EnumDeclarationTranslator INSTANCE = new EnumDeclarationTranslator();

    public static EnumDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, EnumDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        KotlinType.Builder builder = KotlinType.newClass(source.getIdentifier());
        KotlinUtil.addByCSharpModifiers(builder, source.getModifiers());

        List<String> superTypes = BaseListTranslator.getInstance().translate(fileName,
                source.getBaseList(), context);
        for (String superType : superTypes) {
            builder.withSuperType(superType);
        }

        //TODO

        return List.of(builder.build());
    }
}
