package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ForEachVariableStatementInfo;

public class ForEachVariableStatementTranslator implements Translator<ForEachVariableStatementInfo, String> {

    private static final ForEachVariableStatementTranslator INSTANCE = new ForEachVariableStatementTranslator();

    public static ForEachVariableStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ForEachVariableStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
