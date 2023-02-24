package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.OmittedTypeArgumentInfo;

public class OmittedTypeArgumentTranslator implements Translator<OmittedTypeArgumentInfo, String> {

    private static final OmittedTypeArgumentTranslator INSTANCE = new OmittedTypeArgumentTranslator();

    public static OmittedTypeArgumentTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, OmittedTypeArgumentInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
