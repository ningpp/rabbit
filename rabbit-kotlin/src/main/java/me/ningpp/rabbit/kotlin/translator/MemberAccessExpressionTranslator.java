package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.MemberAccessExpressionInfo;

public class MemberAccessExpressionTranslator implements Translator<MemberAccessExpressionInfo, String> {

    private static final MemberAccessExpressionTranslator INSTANCE = new MemberAccessExpressionTranslator();

    public static MemberAccessExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, MemberAccessExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();

        List<String> expressions = ExpressionTranslator.getInstance().translate(
                fileName, source.getExpression(), context
        );

        List<String> simpleNames = SimpleNameTranslator.getInstance().translate(
                fileName, source.getName(), context
        );

        if (!expressions.isEmpty() && !simpleNames.isEmpty()) {
            //TODO ??
            lines.add(expressions.get(0) + source.getOperatorToken() + simpleNames.get(0));
        }

        return lines;
    }

}
