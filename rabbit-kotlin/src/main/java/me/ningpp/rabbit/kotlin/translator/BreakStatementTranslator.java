package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.BreakStatementInfo;

public class BreakStatementTranslator implements Translator<BreakStatementInfo, String> {

    private static final BreakStatementTranslator INSTANCE = new BreakStatementTranslator();

    public static BreakStatementTranslator getInstance() {
        return INSTANCE;
    }

    private static final List<String> BREAK_VALUES = List.of("break");

    @Override
    public List<String> translate(String fileName, BreakStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return BREAK_VALUES;
    }

}
