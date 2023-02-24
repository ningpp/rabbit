package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.CastExpressionInfo;

public class CastExpressionTranslator implements Translator<CastExpressionInfo, String> {

    private static final CastExpressionTranslator INSTANCE = new CastExpressionTranslator();

    public static CastExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, CastExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return List.of(String.format(Locale.ROOT,
                "(%s) as %s",
                String.join("", ExpressionTranslator
                        .getInstance().translate(fileName, source.getExpression(), context)),
                TypeInfoTranlator.translate(source.getType(), context)));
    }

}
