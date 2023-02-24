package me.ningpp.rabbit.model;

import java.util.List;

public class BinaryExpressionInfo extends CommentElement {

    private ExpressionInfo left;

    public ExpressionInfo getLeft() {
        return left;
    }

    public void setLeft(ExpressionInfo left) {
        this.left = left;
    }

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }

    private ExpressionInfo right;

    public ExpressionInfo getRight() {
        return right;
    }

    public void setRight(ExpressionInfo right) {
        this.right = right;
    }
}
