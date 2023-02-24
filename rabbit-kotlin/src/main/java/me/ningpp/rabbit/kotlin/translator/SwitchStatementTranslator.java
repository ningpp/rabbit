package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.SwitchStatementInfo;

public class SwitchStatementTranslator implements Translator<SwitchStatementInfo, String> {

    private static final SwitchStatementTranslator INSTANCE = new SwitchStatementTranslator();

    public static SwitchStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, SwitchStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
