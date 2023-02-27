package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ContinueStatementInfo;

public class ContinueStatementTranslator implements Translator<ContinueStatementInfo, String> {

    private static final ContinueStatementTranslator INSTANCE = new ContinueStatementTranslator();

    public static ContinueStatementTranslator getInstance() {
        return INSTANCE;
    }

    private static final List<String> CONTINUE_VALUES = List.of("continue");

    @Override
    public List<String> translate(String fileName, ContinueStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return CONTINUE_VALUES;
    }

}
