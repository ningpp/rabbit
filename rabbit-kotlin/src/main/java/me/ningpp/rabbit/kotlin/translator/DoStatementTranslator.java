package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.DoStatementInfo;

public class DoStatementTranslator implements Translator<DoStatementInfo, String> {

    private static final DoStatementTranslator INSTANCE = new DoStatementTranslator();

    public static DoStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, DoStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> conditions = ExpressionTranslator.getInstance()
                .translate(fileName, source.getCondition(), context);

        List<String> lines = new ArrayList<>();
        lines.add("do");
        lines.addAll(StatementTranslator
                .getInstance().translate(fileName,
                        source.getStatement(), context));
        if (!conditions.isEmpty()) {
            lines.add(String.format(Locale.ROOT,
                    "while (%s)", String.join("", conditions)));
        }
        return lines;
    }

}
