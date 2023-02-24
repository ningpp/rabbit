package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ScopedTypeInfo;

public class ScopedTypeTranslator implements Translator<ScopedTypeInfo, String> {

    private static final ScopedTypeTranslator INSTANCE = new ScopedTypeTranslator();

    public static ScopedTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ScopedTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
