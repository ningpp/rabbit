package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.MemberBindingExpressionInfo;

public class MemberBindingExpressionTranslator implements Translator<MemberBindingExpressionInfo, String> {

    private static final MemberBindingExpressionTranslator INSTANCE = new MemberBindingExpressionTranslator();

    public static MemberBindingExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, MemberBindingExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        return lines;
    }

}
