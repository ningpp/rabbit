package me.ningpp.rabbit.model;

import java.util.List;

public class ConditionalAccessExpressionInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }

    private ExpressionInfo whenNotNull;

    public ExpressionInfo getWhenNotNull() {
        return whenNotNull;
    }

    public void setWhenNotNull(ExpressionInfo whenNotNull) {
        this.whenNotNull = whenNotNull;
    }
}
