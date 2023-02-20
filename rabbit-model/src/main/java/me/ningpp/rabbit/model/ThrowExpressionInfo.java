package me.ningpp.rabbit.model;

import java.util.List;

public class ThrowExpressionInfo {

    private String throwKeyword;

    public String getThrowKeyword() {
        return throwKeyword;
    }

    public void setThrowKeyword(String throwKeyword) {
        this.throwKeyword = throwKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
