package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.AssignmentExpressionInfo;

public class AssignmentExpressionTranslator implements Translator<AssignmentExpressionInfo, String> {

    private static final AssignmentExpressionTranslator INSTANCE = new AssignmentExpressionTranslator();

    public static AssignmentExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, AssignmentExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();

        List<String> leftExpressions = ExpressionTranslator.getInstance().translate(
                fileName, source.getLeft(), context
        );

        List<String> rightExpressions = ExpressionTranslator.getInstance().translate(
                fileName, source.getRight(), context
        );

        if (!leftExpressions.isEmpty() && !rightExpressions.isEmpty()) {
            //TODO ??
            lines.add(leftExpressions.get(0)
                    + " " + source.getOperatorToken()
                    + " " + rightExpressions.get(0));
        }

        return lines;
    }

}
