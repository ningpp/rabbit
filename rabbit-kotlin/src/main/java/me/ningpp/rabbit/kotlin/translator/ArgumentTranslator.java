package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ArgumentInfo;

public class ArgumentTranslator implements Translator<ArgumentInfo, String> {

    private static final ArgumentTranslator INSTANCE = new ArgumentTranslator();

    public static ArgumentTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ArgumentInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return ExpressionTranslator.getInstance().translate(
                    fileName, source.getExpression(), context);
    }
}
