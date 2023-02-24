package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.SimpleNameInfo;

public class SimpleNameTranslator implements Translator<SimpleNameInfo, String> {

    private static final SimpleNameTranslator INSTANCE = new SimpleNameTranslator();

    public static SimpleNameTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, SimpleNameInfo source, TranslateContext context) {
        List<String> result;
        if (source.getGenericNameInfo() != null) {
            result = GenericNameTranslator.getInstance().translate(
                    source.getGenericNameInfo(), context);
        } else if (source.getIdentifierNameInfo() != null) {
            result = IdentifierNameTranslator.getInstance().translate(
                    source.getIdentifierNameInfo(), context);
        } else {
            result = List.of();
        }
        return result;
    }
}
