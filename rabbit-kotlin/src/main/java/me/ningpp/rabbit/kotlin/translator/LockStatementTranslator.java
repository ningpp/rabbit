package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.LockStatementInfo;

public class LockStatementTranslator implements Translator<LockStatementInfo, String> {

    private static final LockStatementTranslator INSTANCE = new LockStatementTranslator();

    public static LockStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, LockStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        lines.add(String.format(Locale.ROOT,
                "synchronized(%s) {",
                String.join("", ExpressionTranslator.getInstance().translate(
                        fileName, source.getExpression(), context
                ))));
        lines.addAll(StatementTranslator.getInstance()
                .translateWithBrace(false, fileName, source.getStatement(), context));
        lines.add("}");
        return lines;
    }

}
