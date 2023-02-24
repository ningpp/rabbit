package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.BracketedArgumentListInfo;

public class BracketedArgumentListTranslator implements Translator<BracketedArgumentListInfo, String> {

    private static final BracketedArgumentListTranslator INSTANCE = new BracketedArgumentListTranslator();

    public static BracketedArgumentListTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, BracketedArgumentListInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of("[" +
                String.join(", ",
                        ArgumentTranslator.getInstance().translate(fileName, source.getArguments(), context))
                + "]");
    }
}
