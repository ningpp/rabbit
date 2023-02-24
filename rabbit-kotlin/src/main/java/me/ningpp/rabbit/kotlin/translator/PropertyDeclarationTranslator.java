package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinProperty;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.PropertyDeclarationInfo;

public class PropertyDeclarationTranslator implements Translator<PropertyDeclarationInfo, KotlinNamedItem> {

    private static final PropertyDeclarationTranslator INSTANCE = new PropertyDeclarationTranslator();

    public static PropertyDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, PropertyDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<KotlinNamedItem> propertySpecs = new ArrayList<>();
        KotlinProperty.Builder builder = KotlinProperty
                .newVar(source.getIdentifier())
                .withDataType(TypeInfoTranlator
                        .translate(source.getType(), context));
        KotlinUtil.addByCSharpModifiers(builder, source.getModifiers());
        propertySpecs.add(builder.build());
        return propertySpecs;
    }
}
