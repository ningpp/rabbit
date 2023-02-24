package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinProperty;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.FieldDeclarationInfo;
import me.ningpp.rabbit.model.TypeInfo;
import me.ningpp.rabbit.util.Constants;

public class FieldDeclarationTranslator implements Translator<FieldDeclarationInfo, KotlinNamedItem> {

    private static final FieldDeclarationTranslator INSTANCE = new FieldDeclarationTranslator();

    public static FieldDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, FieldDeclarationInfo source, TranslateContext context) {
        List<KotlinNamedItem> propertySpecs = new ArrayList<>();
        if (source == null) {
            return propertySpecs;
        }
        if (source.getDeclaration() != null
                && source.getDeclaration().getVariables() != null) {
            TypeInfo typeInfo = source.getDeclaration().getType();
            String dataType = TypeInfoTranlator.translate(typeInfo, context);
            for (var variable : source.getDeclaration().getVariables()) {
                KotlinProperty.Builder builder = KotlinProperty
                        .newVar(variable.getIdentifier())
                        .withDataType(dataType);
                KotlinUtil.addByCSharpModifiers(builder, source.getModifiers());

                var initializers = EqualsValueClauseTranslator.getInstance().translate(
                        fileName, variable.getInitializer(), context
                );
                if (! initializers.isEmpty()) {
                    builder.withInitializationString(String.join(
                            Constants.DEFAULT_LINE_SEPARATOR,
                            initializers
                    ));
                }

                propertySpecs.add(builder.build());
            }
        }
        return propertySpecs;
    }
}
