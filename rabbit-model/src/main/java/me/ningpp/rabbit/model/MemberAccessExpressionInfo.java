package me.ningpp.rabbit.model;

import java.util.List;

public class MemberAccessExpressionInfo {

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

    private SimpleNameInfo name;

    public SimpleNameInfo getName() {
        return name;
    }

    public void setName(SimpleNameInfo name) {
        this.name = name;
    }
}
