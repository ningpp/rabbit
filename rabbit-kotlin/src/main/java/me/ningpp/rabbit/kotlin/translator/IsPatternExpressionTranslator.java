package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.IsPatternExpressionInfo;

public class IsPatternExpressionTranslator implements Translator<IsPatternExpressionInfo, String> {

    private static final IsPatternExpressionTranslator INSTANCE = new IsPatternExpressionTranslator();

    public static IsPatternExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, IsPatternExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
