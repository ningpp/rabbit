package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.dom.kotlin.KotlinArg;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ParameterInfo;

public class ParameterTranslator implements Translator<ParameterInfo, KotlinArg> {

    private static final ParameterTranslator INSTANCE = new ParameterTranslator();

    public static ParameterTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinArg> translate(String fileName, ParameterInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        KotlinArg.Builder builder = KotlinArg.newArg(source.getIdentifier());
        builder.withDataType(TypeInfoTranlator.translate(source.getType(), context));
        String initializationString = String.join("",
                EqualsValueClauseTranslator.getInstance()
                        .translate(fileName, source.getDefaultInfo(), context));
        if (StringUtils.isNotEmpty(initializationString)) {
            builder.withInitializationString(initializationString);
        }
        return List.of(builder.build());
    }
}
