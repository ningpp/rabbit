package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinArg;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ParameterListInfo;

public class ParameterListTranslator implements Translator<ParameterListInfo, KotlinArg> {

    private static final ParameterListTranslator INSTANCE = new ParameterListTranslator();

    public static ParameterListTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinArg> translate(String fileName, ParameterListInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return ParameterTranslator.getInstance()
                .translate(fileName, source.getParameters(), context);
    }
}
