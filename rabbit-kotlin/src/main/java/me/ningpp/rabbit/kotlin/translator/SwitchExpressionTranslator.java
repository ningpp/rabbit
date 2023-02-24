package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.SwitchExpressionInfo;

public class SwitchExpressionTranslator implements Translator<SwitchExpressionInfo, String> {

    private static final SwitchExpressionTranslator INSTANCE = new SwitchExpressionTranslator();

    public static SwitchExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, SwitchExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
