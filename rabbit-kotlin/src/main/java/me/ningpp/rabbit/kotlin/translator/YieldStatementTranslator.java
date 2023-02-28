package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.YieldStatementInfo;

public class YieldStatementTranslator implements Translator<YieldStatementInfo, String> {

    private static final YieldStatementTranslator INSTANCE = new YieldStatementTranslator();

    public static YieldStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, YieldStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        if ("return".equals(source.getReturnOrBreakKeyword())) {
            lines.add(String.format(
                    Locale.ROOT,
                    "yield(%s)",
                    String.join("", ExpressionTranslator.getInstance().translate(
                            fileName, source.getExpression(), context
                    ))));
        } else {
            lines.add("return@");
        }
        return lines;
    }

}
