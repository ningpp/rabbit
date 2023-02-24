package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.EqualsValueClauseInfo;

public class EqualsValueClauseTranslator implements Translator<EqualsValueClauseInfo, String> {

    private static final EqualsValueClauseTranslator INSTANCE = new EqualsValueClauseTranslator();

    public static EqualsValueClauseTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, EqualsValueClauseInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return ExpressionTranslator.getInstance().translate(
                fileName, source.getValue(), context
        );
    }
}
