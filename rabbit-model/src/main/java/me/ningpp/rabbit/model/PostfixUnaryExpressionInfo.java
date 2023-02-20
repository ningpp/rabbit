package me.ningpp.rabbit.model;

import java.util.List;

public class PostfixUnaryExpressionInfo {

    private ExpressionInfo operand;

    public ExpressionInfo getOperand() {
        return operand;
    }

    public void setOperand(ExpressionInfo operand) {
        this.operand = operand;
    }

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }
}
