package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ConditionalExpressionInfo;

public class ConditionalExpressionTranslator implements Translator<ConditionalExpressionInfo, String> {

    private static final ConditionalExpressionTranslator INSTANCE = new ConditionalExpressionTranslator();

    public static ConditionalExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ConditionalExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        lines.add(String.format(Locale.ROOT,
                "if (%s) {",
                String.join("", ExpressionTranslator.getInstance().translate(
                        fileName, source.getCondition(), context
                ))));
        lines.addAll(ExpressionTranslator.getInstance().translate(
                fileName, source.getWhenTrue(), context
        ));
        lines.add("} else {");
        lines.addAll(ExpressionTranslator.getInstance().translate(
                        fileName, source.getWhenFalse(), context
                ));
        lines.add("}");
        return lines;
    }

}
