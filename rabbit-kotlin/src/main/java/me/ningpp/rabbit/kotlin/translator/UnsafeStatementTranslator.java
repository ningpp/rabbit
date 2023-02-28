package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.exception.UnsupportedSyntaxException;
import me.ningpp.rabbit.model.UnsafeStatementInfo;

public class UnsafeStatementTranslator implements Translator<UnsafeStatementInfo, String> {

    private static final UnsafeStatementTranslator INSTANCE = new UnsafeStatementTranslator();

    public static UnsafeStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, UnsafeStatementInfo source, TranslateContext context) {
        if (source != null && context.isThrowUnsupportedSyntaxException()) {
            throw new UnsupportedSyntaxException();
        }
        return List.of();
    }

}
