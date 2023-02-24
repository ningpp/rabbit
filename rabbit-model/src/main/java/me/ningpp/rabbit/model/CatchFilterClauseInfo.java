package me.ningpp.rabbit.model;

import java.util.List;

public class CatchFilterClauseInfo extends CommentElement {

    private String whenKeyword;

    public String getWhenKeyword() {
        return whenKeyword;
    }

    public void setWhenKeyword(String whenKeyword) {
        this.whenKeyword = whenKeyword;
    }

    private ExpressionInfo filterExpression;

    public ExpressionInfo getFilterExpression() {
        return filterExpression;
    }

    public void setFilterExpression(ExpressionInfo filterExpression) {
        this.filterExpression = filterExpression;
    }
}
