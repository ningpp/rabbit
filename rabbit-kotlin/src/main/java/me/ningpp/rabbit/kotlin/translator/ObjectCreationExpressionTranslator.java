package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ObjectCreationExpressionInfo;

public class ObjectCreationExpressionTranslator implements Translator<ObjectCreationExpressionInfo, String> {

    private static final ObjectCreationExpressionTranslator INSTANCE = new ObjectCreationExpressionTranslator();

    public static ObjectCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ObjectCreationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(String.format(Locale.ROOT,
                "new %s(%s)",
                TypeInfoTranlator.translate(source.getType(), context),
                String.join(", ",
                        ArgumentListTranslator.getInstance().translate(
                                fileName, source.getArgumentList(), context
                        ))));
    }

}
