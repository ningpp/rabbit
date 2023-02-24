package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.PredefinedTypeInfo;

public class PredefinedTypeTranslator implements Translator<PredefinedTypeInfo, String> {

    private static final PredefinedTypeTranslator INSTANCE = new PredefinedTypeTranslator();

    public static PredefinedTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, PredefinedTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
