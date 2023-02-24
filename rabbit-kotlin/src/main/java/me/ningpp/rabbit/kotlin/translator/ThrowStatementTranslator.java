package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ThrowStatementInfo;

public class ThrowStatementTranslator implements Translator<ThrowStatementInfo, String> {

    private static final ThrowStatementTranslator INSTANCE = new ThrowStatementTranslator();

    public static ThrowStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ThrowStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(String.format("throw %s",
                String.join("", ExpressionTranslator
                        .getInstance().translate(fileName,
                                source.getExpression(), context))));
    }

}
