package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.OmittedArraySizeExpressionInfo;

public class OmittedArraySizeExpressionTranslator implements Translator<OmittedArraySizeExpressionInfo, String> {

    private static final OmittedArraySizeExpressionTranslator INSTANCE = new OmittedArraySizeExpressionTranslator();

    public static OmittedArraySizeExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, OmittedArraySizeExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of("");
    }

}
