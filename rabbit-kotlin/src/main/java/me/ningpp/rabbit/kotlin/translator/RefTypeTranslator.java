package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.RefTypeInfo;

public class RefTypeTranslator implements Translator<RefTypeInfo, String> {

    private static final RefTypeTranslator INSTANCE = new RefTypeTranslator();

    public static RefTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, RefTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
