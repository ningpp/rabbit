package me.ningpp.rabbit.model;

import java.util.List;

public class QueryExpressionInfo {

    private FromClauseInfo fromClause;

    public FromClauseInfo getFromClause() {
        return fromClause;
    }

    public void setFromClause(FromClauseInfo fromClause) {
        this.fromClause = fromClause;
    }

    private QueryBodyInfo body;

    public QueryBodyInfo getBody() {
        return body;
    }

    public void setBody(QueryBodyInfo body) {
        this.body = body;
    }
}
