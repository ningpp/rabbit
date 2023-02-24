package me.ningpp.rabbit.model;

import java.util.List;

public class ElementAccessExpressionInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private BracketedArgumentListInfo argumentList;

    public BracketedArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(BracketedArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }
}
