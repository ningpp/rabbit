package me.ningpp.rabbit.model;

import java.util.List;

public class RangeExpressionInfo extends CommentElement {

    private ExpressionInfo leftOperand;

    public ExpressionInfo getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(ExpressionInfo leftOperand) {
        this.leftOperand = leftOperand;
    }

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }

    private ExpressionInfo rightOperand;

    public ExpressionInfo getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(ExpressionInfo rightOperand) {
        this.rightOperand = rightOperand;
    }
}
