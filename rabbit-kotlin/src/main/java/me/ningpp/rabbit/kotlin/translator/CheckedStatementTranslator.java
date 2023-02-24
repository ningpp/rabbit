package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.CheckedStatementInfo;

public class CheckedStatementTranslator implements Translator<CheckedStatementInfo, String> {

    private static final CheckedStatementTranslator INSTANCE = new CheckedStatementTranslator();

    public static CheckedStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, CheckedStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
