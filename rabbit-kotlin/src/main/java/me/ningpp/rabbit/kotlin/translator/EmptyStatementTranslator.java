package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.EmptyStatementInfo;

public class EmptyStatementTranslator implements Translator<EmptyStatementInfo, String> {

    private static final EmptyStatementTranslator INSTANCE = new EmptyStatementTranslator();

    public static EmptyStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, EmptyStatementInfo source, TranslateContext context) {
        //do not produce an empty statement
        return List.of();
    }

}
