package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ThisExpressionInfo;

public class ThisExpressionTranslator implements Translator<ThisExpressionInfo, String> {

    private static final ThisExpressionTranslator INSTANCE = new ThisExpressionTranslator();

    public static ThisExpressionTranslator getInstance() {
        return INSTANCE;
    }

    private static final List<String> THIS_VALUES = List.of("this");

    @Override
    public List<String> translate(String fileName, ThisExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return THIS_VALUES;
    }

}
