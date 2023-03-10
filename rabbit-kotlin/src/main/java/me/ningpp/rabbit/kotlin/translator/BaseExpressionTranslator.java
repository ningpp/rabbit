package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.BaseExpressionInfo;

public class BaseExpressionTranslator implements Translator<BaseExpressionInfo, String> {

    private static final BaseExpressionTranslator INSTANCE = new BaseExpressionTranslator();

    public static BaseExpressionTranslator getInstance() {
        return INSTANCE;
    }

    private static final List<String> SUPER_VALUES = List.of("super");

    @Override
    public List<String> translate(String fileName, BaseExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return SUPER_VALUES;
    }

}
