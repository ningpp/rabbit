package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ParenthesizedExpressionInfo;

public class ParenthesizedExpressionTranslator implements Translator<ParenthesizedExpressionInfo, String> {

    private static final ParenthesizedExpressionTranslator INSTANCE = new ParenthesizedExpressionTranslator();

    public static ParenthesizedExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ParenthesizedExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(String.format(Locale.ROOT,
                "(%s)",
                String.join("", ExpressionTranslator.getInstance().translate(
                        fileName, source.getExpression(), context
                ))));
    }

}
