package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.TupleTypeInfo;

public class TupleTypeTranslator implements Translator<TupleTypeInfo, String> {

    private static final TupleTypeTranslator INSTANCE = new TupleTypeTranslator();

    public static TupleTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, TupleTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
