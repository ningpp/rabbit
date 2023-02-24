package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.PrefixUnaryExpressionInfo;

public class PrefixUnaryExpressionTranslator implements Translator<PrefixUnaryExpressionInfo, String> {

    private static final PrefixUnaryExpressionTranslator INSTANCE = new PrefixUnaryExpressionTranslator();

    public static PrefixUnaryExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, PrefixUnaryExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return List.of(source.getOperatorToken()
            + String.join("", ExpressionTranslator.getInstance()
                .translate(fileName, source.getOperand(), context)));
    }

}
