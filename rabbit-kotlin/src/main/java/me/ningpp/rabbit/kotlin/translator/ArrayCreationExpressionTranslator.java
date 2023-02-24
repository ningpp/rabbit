package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ArrayCreationExpressionInfo;

public class ArrayCreationExpressionTranslator implements Translator<ArrayCreationExpressionInfo, String> {

    private static final ArrayCreationExpressionTranslator INSTANCE = new ArrayCreationExpressionTranslator();

    public static ArrayCreationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ArrayCreationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return ArrayTypeTranslator.getInstance()
                    .translate("", source.getType(), context);
    }

}
