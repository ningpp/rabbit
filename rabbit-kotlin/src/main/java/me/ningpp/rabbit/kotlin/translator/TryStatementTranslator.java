package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.TryStatementInfo;

public class TryStatementTranslator implements Translator<TryStatementInfo, String> {

    private static final TryStatementTranslator INSTANCE = new TryStatementTranslator();

    public static TryStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, TryStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        //TODO
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
