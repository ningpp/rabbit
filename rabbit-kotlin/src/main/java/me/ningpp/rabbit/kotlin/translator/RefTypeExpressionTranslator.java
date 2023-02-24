package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.RefTypeExpressionInfo;

public class RefTypeExpressionTranslator implements Translator<RefTypeExpressionInfo, String> {

    private static final RefTypeExpressionTranslator INSTANCE = new RefTypeExpressionTranslator();

    public static RefTypeExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, RefTypeExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
