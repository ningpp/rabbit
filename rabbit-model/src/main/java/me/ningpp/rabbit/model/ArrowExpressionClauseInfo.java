package me.ningpp.rabbit.model;

import java.util.List;

public class ArrowExpressionClauseInfo extends CommentElement {

    private String arrowToken;

    public String getArrowToken() {
        return arrowToken;
    }

    public void setArrowToken(String arrowToken) {
        this.arrowToken = arrowToken;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
