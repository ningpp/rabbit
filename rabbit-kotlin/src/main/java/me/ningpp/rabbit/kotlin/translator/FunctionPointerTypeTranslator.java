package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.FunctionPointerTypeInfo;

public class FunctionPointerTypeTranslator implements Translator<FunctionPointerTypeInfo, String> {

    private static final FunctionPointerTypeTranslator INSTANCE = new FunctionPointerTypeTranslator();

    public static FunctionPointerTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, FunctionPointerTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
