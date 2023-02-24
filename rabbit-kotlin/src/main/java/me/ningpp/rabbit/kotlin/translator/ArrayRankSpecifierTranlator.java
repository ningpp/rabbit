package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ArrayRankSpecifierInfo;

public class ArrayRankSpecifierTranlator implements Translator<ArrayRankSpecifierInfo, String> {

    private static final ArrayRankSpecifierTranlator INSTANCE = new ArrayRankSpecifierTranlator();

    public static ArrayRankSpecifierTranlator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ArrayRankSpecifierInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return ExpressionTranslator.getInstance().translate(
                fileName, source.getSizes(), context
        );
    }
}
