package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.dom.kotlin.KotlinFunction;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.csharp.CSharpModifier;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.MethodDeclarationInfo;

public class MethodDeclarationTranslator implements Translator<MethodDeclarationInfo, KotlinNamedItem> {

    private static final MethodDeclarationTranslator INSTANCE = new MethodDeclarationTranslator();

    public static MethodDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, MethodDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        KotlinFunction.Builder builder = KotlinFunction.newMultiLineFunction(source.getIdentifier());

        KotlinUtil.addByCSharpModifiers(builder, source.getModifiers());

        List<CSharpModifier> modifiers = CSharpModifier.parse(source.getModifiers());
        if (modifiers.contains(CSharpModifier.STATIC)) {
            builder.withAnnotation("@JvmStatic");
        }

        KotlinUtil.addParameters(builder, source.getParameterList(), fileName, context);

        String returnType = TypeInfoTranlator.translate(source.getReturnType(), context);
        if (StringUtils.isNotEmpty(returnType) && !"void".equals(returnType)) {
            builder.withExplicitReturnType(returnType);
        }

        if (source.getExpressionBody() != null) {
            //TODO
        } else {
            List<String> lines = BlockTranslator.getInstance()
                    .translateWithBrace(
                            false,
                            fileName,
                            source.getBody(),
                            context);
            for (String line : lines) {
                builder.withCodeLine(line);
            }
        }

        return List.of(builder.build());
    }
}
