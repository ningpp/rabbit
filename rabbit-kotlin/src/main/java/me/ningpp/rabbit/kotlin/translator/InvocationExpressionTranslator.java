package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.InvocationExpressionInfo;

public class InvocationExpressionTranslator implements Translator<InvocationExpressionInfo, String> {

    private static final InvocationExpressionTranslator INSTANCE = new InvocationExpressionTranslator();

    public static InvocationExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, InvocationExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }

        List<String> expressions = ExpressionTranslator.getInstance().translate(
                fileName,
                source.getExpression(),
                context);
        if (expressions.isEmpty()) {
            return List.of();
        }

        List<String> lines = new ArrayList<>();
        List<String> args = ArgumentListTranslator.getInstance().translate(
                fileName, source.getArgumentList(), context
        );
        String paramPassValue;
        if (args.isEmpty()) {
            paramPassValue = "";
        } else {
            paramPassValue = String.join(", ", args);
        }
        lines.add(
                expressions.get(0) +
                String.format(Locale.ROOT, "(%s)", paramPassValue));
        return lines;
    }

}
