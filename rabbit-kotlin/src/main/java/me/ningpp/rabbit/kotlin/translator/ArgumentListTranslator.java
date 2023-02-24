package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ArgumentListInfo;

public class ArgumentListTranslator implements Translator<ArgumentListInfo, String> {

    private static final ArgumentListTranslator INSTANCE = new ArgumentListTranslator();

    public static ArgumentListTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ArgumentListInfo source, TranslateContext context) {
        if (source == null || source.getArguments() == null) {
            return List.of();
        }
        return ArgumentTranslator.getInstance().translate(fileName, source.getArguments(), context);
    }
}
