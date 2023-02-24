package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.BaseListInfo;

public class BaseListTranslator implements Translator<BaseListInfo, String> {

    private static final BaseListTranslator INSTANCE = new BaseListTranslator();

    public static BaseListTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, BaseListInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return BaseTypeTranslator.getInstance().translate(fileName, source.getTypes(), context);
    }
}
