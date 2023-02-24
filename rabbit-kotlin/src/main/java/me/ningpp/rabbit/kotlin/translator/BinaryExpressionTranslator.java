package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.BinaryExpressionInfo;

public class BinaryExpressionTranslator implements Translator<BinaryExpressionInfo, String> {

    private static final BinaryExpressionTranslator INSTANCE = new BinaryExpressionTranslator();

    public static BinaryExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, BinaryExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(
                String.join("", ExpressionTranslator
                        .getInstance().translate(fileName, source.getLeft(), context))
                + " "
                + source.getOperatorToken()
                + " "
                + String.join("", ExpressionTranslator
                        .getInstance().translate(fileName, source.getRight(), context))
        );
    }

}
