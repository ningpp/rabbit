package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.BaseTypeInfo;

public class BaseTypeTranslator implements Translator<BaseTypeInfo, String> {

    private static final BaseTypeTranslator INSTANCE = new BaseTypeTranslator();

    public static BaseTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, BaseTypeInfo source, TranslateContext context) {
        List<String> results;
        if (source == null) {
            results = List.of();
        } else if (source.getSimpleBaseTypeInfo() != null) {
            results = SimpleBaseTypeTranslator.getInstance().translate(fileName, source.getSimpleBaseTypeInfo(), context);
        } else {
            results = PrimaryConstructorBaseTypeTranslator.getInstance().translate(fileName, source.getPrimaryConstructorBaseTypeInfo(), context);
        }
        return results;
    }
}
