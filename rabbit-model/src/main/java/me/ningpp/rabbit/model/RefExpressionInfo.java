package me.ningpp.rabbit.model;

import java.util.List;

public class RefExpressionInfo {

    private String refKeyword;

    public String getRefKeyword() {
        return refKeyword;
    }

    public void setRefKeyword(String refKeyword) {
        this.refKeyword = refKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
