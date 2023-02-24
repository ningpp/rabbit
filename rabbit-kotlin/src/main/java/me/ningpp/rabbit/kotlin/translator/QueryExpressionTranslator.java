package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.QueryExpressionInfo;

public class QueryExpressionTranslator implements Translator<QueryExpressionInfo, String> {

    private static final QueryExpressionTranslator INSTANCE = new QueryExpressionTranslator();

    public static QueryExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, QueryExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
