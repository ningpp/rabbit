package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinType;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.ClassDeclarationInfo;

public class ClassDeclarationTranslator implements Translator<ClassDeclarationInfo, KotlinNamedItem> {

    private static final ClassDeclarationTranslator INSTANCE = new ClassDeclarationTranslator();

    public static ClassDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, ClassDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        KotlinType.Builder classBuilder = KotlinType.newClass(source.getIdentifier());
        KotlinUtil.addByCSharpModifiers(classBuilder, source.getModifiers());

        KotlinUtil.addMembers(classBuilder,
                source.getMembers(), fileName, context);

        return List.of(classBuilder.build());
    }
}
