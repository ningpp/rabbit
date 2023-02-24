package me.ningpp.rabbit.kotlin.util;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinArg;
import org.mybatis.generator.api.dom.kotlin.KotlinFunction;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem.AbstractBuilder;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItemContainer.NamedItemContainerBuilder;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.csharp.CSharpModifier;
import me.ningpp.rabbit.kotlin.KtModifier;
import me.ningpp.rabbit.kotlin.translator.MemberDeclarationTranslator;
import me.ningpp.rabbit.kotlin.translator.ParameterListTranslator;
import me.ningpp.rabbit.model.MemberDeclarationInfo;
import me.ningpp.rabbit.model.ParameterListInfo;

public class KotlinUtil {

    public static void addParameters(
            KotlinFunction.Builder builder,
            ParameterListInfo parameterList,
            String fileName,
            TranslateContext context) {
        List<KotlinArg> args = ParameterListTranslator.getInstance()
                .translate(fileName, parameterList, context);
        for (KotlinArg kotlinArg : args) {
            builder.withArgument(kotlinArg);
        }
    }

    public static <T extends NamedItemContainerBuilder<T>> void addMembers(
            NamedItemContainerBuilder<T> builder,
            List<MemberDeclarationInfo> members,
            String fileName,
            TranslateContext context) {
        List<KotlinNamedItem> memberItems = MemberDeclarationTranslator.getInstance()
                .translate(fileName, members, context);
        for (KotlinNamedItem memberItem : memberItems) {
            builder.withNamedItem(memberItem);
        }
    }

    public static <T extends AbstractBuilder<T>> void addByCSharpModifiers(
            AbstractBuilder<T> builder,
            List<String> modifiers) {
        addModifiers(builder,
                CSharpModifier.parse2Kotlin(modifiers));
    }

    public static <T extends AbstractBuilder<T>> void addModifiers(
            AbstractBuilder<T> builder,
            List<KtModifier> modifiers) {
        if (modifiers != null) {
            for (var modifier : modifiers) {
                if (modifier.getKotlinModifier() != null) {
                    builder.withModifier(
                            modifier.getKotlinModifier()
                    );
                } else {
                    System.err.println(modifier + "\t" + modifier.getKotlinModifier());
                }
            }
        }
    }

}
