package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.LiteralExpressionInfo;

public class LiteralExpressionTranslator implements Translator<LiteralExpressionInfo, String> {

    private static final LiteralExpressionTranslator INSTANCE = new LiteralExpressionTranslator();

    public static LiteralExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, LiteralExpressionInfo source, TranslateContext context) {
        if (source == null || StringUtils.isEmpty(source.getToken())) {
            return List.of();
        }
        return List.of(source.getToken());
    }

}
