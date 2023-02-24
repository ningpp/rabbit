package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.LabeledStatementInfo;

public class LabeledStatementTranslator implements Translator<LabeledStatementInfo, String> {

    private static final LabeledStatementTranslator INSTANCE = new LabeledStatementTranslator();

    public static LabeledStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, LabeledStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
