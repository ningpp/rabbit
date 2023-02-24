package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.PostfixUnaryExpressionInfo;

public class PostfixUnaryExpressionTranslator implements Translator<PostfixUnaryExpressionInfo, String> {

    private static final PostfixUnaryExpressionTranslator INSTANCE = new PostfixUnaryExpressionTranslator();

    public static PostfixUnaryExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, PostfixUnaryExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        lines.add(String.format(
                Locale.ROOT,
                "%s%s",
                String.join(
                        "",
                        ExpressionTranslator.getInstance().translate(
                                fileName, source.getOperand(), context
                        )
                ),
                source.getOperatorToken()
        ));
        return lines;
    }

}
