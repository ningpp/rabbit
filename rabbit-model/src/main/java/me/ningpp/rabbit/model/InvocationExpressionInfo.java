package me.ningpp.rabbit.model;

import java.util.List;

public class InvocationExpressionInfo {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private ArgumentListInfo argumentList;

    public ArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }
}
