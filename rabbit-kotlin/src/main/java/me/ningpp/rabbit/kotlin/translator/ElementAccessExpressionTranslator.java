package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ElementAccessExpressionInfo;

public class ElementAccessExpressionTranslator implements Translator<ElementAccessExpressionInfo, String> {

    private static final ElementAccessExpressionTranslator INSTANCE = new ElementAccessExpressionTranslator();

    public static ElementAccessExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ElementAccessExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of(
                String.join("", ExpressionTranslator.getInstance()
                        .translate(fileName, source.getExpression(), context))
                +
                String.join("", BracketedArgumentListTranslator.getInstance()
                        .translate(fileName, source.getArgumentList(), context))
        );
    }

}
