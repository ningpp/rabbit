package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.LocalFunctionStatementInfo;

public class LocalFunctionStatementTranslator implements Translator<LocalFunctionStatementInfo, String> {

    private static final LocalFunctionStatementTranslator INSTANCE = new LocalFunctionStatementTranslator();

    public static LocalFunctionStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, LocalFunctionStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
