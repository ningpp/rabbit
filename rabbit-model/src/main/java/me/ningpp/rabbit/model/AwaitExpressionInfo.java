package me.ningpp.rabbit.model;

import java.util.List;

public class AwaitExpressionInfo extends CommentElement {

    private String awaitKeyword;

    public String getAwaitKeyword() {
        return awaitKeyword;
    }

    public void setAwaitKeyword(String awaitKeyword) {
        this.awaitKeyword = awaitKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
