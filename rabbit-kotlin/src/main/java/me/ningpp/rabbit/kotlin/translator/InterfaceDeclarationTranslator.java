package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinType;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.InterfaceDeclarationInfo;

public class InterfaceDeclarationTranslator implements Translator<InterfaceDeclarationInfo, KotlinNamedItem> {

    private static final InterfaceDeclarationTranslator INSTANCE = new InterfaceDeclarationTranslator();

    public static InterfaceDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, InterfaceDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        KotlinType.Builder builder = KotlinType.newInterface(source.getIdentifier());
        builder.withComments(KotlinUtil.parseComments(source.getComments()));
        KotlinUtil.addByCSharpModifiers(builder, source.getModifiers());

        List<String> superTypes = BaseListTranslator.getInstance().translate(fileName,
                source.getBaseList(), context);
        for (String superType : superTypes) {
            builder.withSuperType(superType);
        }

        KotlinUtil.addMembers(builder,
                source.getMembers(), fileName, context);

        return List.of(builder.build());
    }
}
