package me.ningpp.rabbit.kotlin.translator;

import static me.ningpp.rabbit.util.Constants.DEFAULT_LINE_SEPARATOR;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.dom.kotlin.KotlinProperty;
import org.mybatis.generator.api.dom.kotlin.render.KotlinPropertyRenderer;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.csharp.CSharpModifier;
import me.ningpp.rabbit.kotlin.KtModifier;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.LocalDeclarationStatementInfo;
import me.ningpp.rabbit.model.TypeInfo;

public class LocalDeclarationStatementTranslator implements Translator<LocalDeclarationStatementInfo, String> {

    private static final LocalDeclarationStatementTranslator INSTANCE = new LocalDeclarationStatementTranslator();

    public static LocalDeclarationStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, LocalDeclarationStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        //TODO support source.getIsConst()
        //TODO support source.getAwaitKeyword()
        if (source.getDeclaration() != null
                && source.getDeclaration().getVariables() != null) {
            TypeInfo typeInfo = source.getDeclaration().getType();
            String dataType = TypeInfoTranlator.translate(typeInfo, context);
            for (var variable : source.getDeclaration().getVariables()) {
                List<KtModifier> ktModifiers =CSharpModifier.parse2Kotlin(source.getModifiers());
                KotlinProperty.Builder builder;
                if (ktModifiers.contains(KtModifier.CONST)) {
                    builder = KotlinProperty
                            .newVal(variable.getIdentifier());
                } else {
                    builder = KotlinProperty
                            .newVar(variable.getIdentifier());
                }
                if (!"var".equals(dataType)) {
                    builder.withDataType(dataType);
                }

                String initializationString = String.join(DEFAULT_LINE_SEPARATOR,
                        EqualsValueClauseTranslator
                            .getInstance().translate(
                                fileName, variable.getInitializer(), context
                        ));
                if (StringUtils.isNotEmpty(initializationString)) {
                    builder.withInitializationString(initializationString);
                }
                lines.addAll(new KotlinPropertyRenderer().render(builder.build()));
            }
        }
        return lines;
    }

}
