package me.ningpp.rabbit.model;

import java.util.List;

public class InitializerExpressionInfo extends CommentElement {

    private List<ExpressionInfo> expressions;

    public List<ExpressionInfo> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<ExpressionInfo> expressions) {
        this.expressions = expressions;
    }
}
