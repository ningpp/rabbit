package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.MakeRefExpressionInfo;

public class MakeRefExpressionTranslator implements Translator<MakeRefExpressionInfo, String> {

    private static final MakeRefExpressionTranslator INSTANCE = new MakeRefExpressionTranslator();

    public static MakeRefExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, MakeRefExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
