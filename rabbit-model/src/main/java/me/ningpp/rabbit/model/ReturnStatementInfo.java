package me.ningpp.rabbit.model;

import java.util.List;

public class ReturnStatementInfo extends SourceLocation {

    private String returnKeyword;

    public String getReturnKeyword() {
        return returnKeyword;
    }

    public void setReturnKeyword(String returnKeyword) {
        this.returnKeyword = returnKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
