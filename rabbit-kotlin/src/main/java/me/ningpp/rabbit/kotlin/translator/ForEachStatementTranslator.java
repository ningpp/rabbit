package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ForEachStatementInfo;

public class ForEachStatementTranslator implements Translator<ForEachStatementInfo, String> {

    private static final ForEachStatementTranslator INSTANCE = new ForEachStatementTranslator();

    public static ForEachStatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ForEachStatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();
        lines.add(String.format(
                Locale.ROOT,
                "for (%s in %s)",
                source.getIdentifier(),
                String.join(
                    "",
                    ExpressionTranslator.getInstance().translate(
                            fileName, source.getExpression(), context
                    )
                )
        ));
        lines.addAll(StatementTranslator.getInstance().translate(
                fileName, source.getStatement(), context
        ));
        return lines;
    }

}
