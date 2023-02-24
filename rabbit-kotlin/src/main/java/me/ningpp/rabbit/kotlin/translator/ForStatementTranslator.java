package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ForStatementInfo;

public class ForStatementTranslator implements Translator<ForStatementInfo, String> {

    private static final ForStatementTranslator INSTANCE = new ForStatementTranslator();

    public static ForStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ForStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        //TODO
        return List.of();
    }

}
