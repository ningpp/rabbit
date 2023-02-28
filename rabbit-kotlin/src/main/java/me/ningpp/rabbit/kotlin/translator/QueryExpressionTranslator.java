package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.QueryExpressionInfo;

public class QueryExpressionTranslator implements Translator<QueryExpressionInfo, String> {

    private static final QueryExpressionTranslator INSTANCE = new QueryExpressionTranslator();

    public static QueryExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, QueryExpressionInfo source, TranslateContext context) {
        if (source == null || source.getFromClause() == null
            || source.getBody() == null) {
            return List.of();
        }
        //TODO

        List<String> lines = new ArrayList<>();
        String prefix = "";
        if (source.getBody().getClauses() != null
            && !source.getBody().getClauses().isEmpty()) {
            prefix = "/*TODO*/";
        }
        StringBuilder builder = new StringBuilder(String.format(Locale.ROOT,
                prefix + "%s",
                String.join("", ExpressionTranslator.getInstance().translate(
                        fileName, source.getFromClause().getExpression(), context
                ))));

        if (source.getBody().getSelectOrGroup() != null) {
            var selectOrGroup = source.getBody().getSelectOrGroup();
            if (selectOrGroup.getSelectClauseInfo() != null) {
                builder.append(String.format(Locale.ROOT,
                        ".map { %s -> %s }",
                        source.getFromClause().getIdentifier(),
                        String.join("", ExpressionTranslator.getInstance().translate(
                                fileName, selectOrGroup.getSelectClauseInfo().getExpression(), context
                        ))));
            }
            if (selectOrGroup.getGroupClauseInfo() != null) {
                builder.append(String.format(Locale.ROOT,
                        ".groupBy { %s -> %s }",
                        source.getFromClause().getIdentifier(),
                        String.join("", ExpressionTranslator.getInstance().translate(
                                fileName, selectOrGroup.getGroupClauseInfo().getByExpression(), context
                        ))));
            }
        }
        lines.add(builder.toString());
        return lines;
    }

}
