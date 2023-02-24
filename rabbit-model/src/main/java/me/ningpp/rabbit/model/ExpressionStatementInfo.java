package me.ningpp.rabbit.model;

import java.util.List;

public class ExpressionStatementInfo extends SourceLocation {

    private boolean allowsAnyExpression;

    public boolean getAllowsAnyExpression() {
        return allowsAnyExpression;
    }

    public void setAllowsAnyExpression(boolean allowsAnyExpression) {
        this.allowsAnyExpression = allowsAnyExpression;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
