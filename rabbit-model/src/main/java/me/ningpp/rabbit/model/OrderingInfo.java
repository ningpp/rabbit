package me.ningpp.rabbit.model;

import java.util.List;

public class OrderingInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private String ascendingOrDescendingKeyword;

    public String getAscendingOrDescendingKeyword() {
        return ascendingOrDescendingKeyword;
    }

    public void setAscendingOrDescendingKeyword(String ascendingOrDescendingKeyword) {
        this.ascendingOrDescendingKeyword = ascendingOrDescendingKeyword;
    }
}
