package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.TupleExpressionInfo;

public class TupleExpressionTranslator implements Translator<TupleExpressionInfo, String> {

    private static final TupleExpressionTranslator INSTANCE = new TupleExpressionTranslator();

    public static TupleExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, TupleExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
