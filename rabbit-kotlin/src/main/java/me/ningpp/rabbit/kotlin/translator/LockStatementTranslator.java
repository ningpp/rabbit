package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.LockStatementInfo;

public class LockStatementTranslator implements Translator<LockStatementInfo, String> {

    private static final LockStatementTranslator INSTANCE = new LockStatementTranslator();

    public static LockStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, LockStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
