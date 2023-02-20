package me.ningpp.rabbit.model;

import java.util.List;

public class WithExpressionInfo {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private String withKeyword;

    public String getWithKeyword() {
        return withKeyword;
    }

    public void setWithKeyword(String withKeyword) {
        this.withKeyword = withKeyword;
    }

    private InitializerExpressionInfo initializer;

    public InitializerExpressionInfo getInitializer() {
        return initializer;
    }

    public void setInitializer(InitializerExpressionInfo initializer) {
        this.initializer = initializer;
    }
}
