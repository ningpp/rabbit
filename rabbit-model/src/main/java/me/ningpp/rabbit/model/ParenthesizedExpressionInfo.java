package me.ningpp.rabbit.model;

import java.util.List;

public class ParenthesizedExpressionInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
