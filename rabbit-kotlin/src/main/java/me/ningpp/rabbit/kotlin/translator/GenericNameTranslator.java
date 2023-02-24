package me.ningpp.rabbit.kotlin.translator;

import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.GenericNameInfo;

public class GenericNameTranslator implements Translator<GenericNameInfo, String> {

    private static final GenericNameTranslator INSTANCE = new GenericNameTranslator();

    public static GenericNameTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, GenericNameInfo source, TranslateContext context) {
        if (source == null || source.getTypeArgumentList() == null) {
            return List.of();
        }
        return List.of(String.format(Locale.ROOT,
                "%s<%s>",
                source.getIdentifier(),
                String.join(", ",
                        TypeArgumentListTranslator.getInstance().translate(
                                fileName, source.getTypeArgumentList(), context
                        ))));
    }

}
