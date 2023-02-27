package me.ningpp.rabbit.kotlin.translator;

import static me.ningpp.rabbit.util.Constants.DEFAULT_LINE_SEPARATOR;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.dom.kotlin.KotlinProperty;
import org.mybatis.generator.api.dom.kotlin.render.KotlinPropertyRenderer;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.TypeInfo;
import me.ningpp.rabbit.model.VariableDeclarationInfo;

public class VariableDeclarationTranslator implements Translator<VariableDeclarationInfo, String> {

    private static final VariableDeclarationTranslator INSTANCE = new VariableDeclarationTranslator();

    public static VariableDeclarationTranslator getInstance() {
        return INSTANCE;
    }
    @Override
    public List<String> translate(String fileName, VariableDeclarationInfo source, TranslateContext context) {
        if (source == null || source.getVariables() == null) {
            return List.of();
        }
        TypeInfo typeInfo = source.getType();
        String dataType = TypeInfoTranlator.translate(typeInfo, context);
        List<String> lines = new ArrayList<>();
        for (var variable : source.getVariables()) {
            KotlinProperty.Builder builder = KotlinProperty.newVar(variable.getIdentifier());
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
        return lines;
    }
}
