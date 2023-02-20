package me.ningpp.rabbit.model;

import java.util.List;

public class BinaryPatternInfo {

    private PatternInfo left;

    public PatternInfo getLeft() {
        return left;
    }

    public void setLeft(PatternInfo left) {
        this.left = left;
    }

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }

    private PatternInfo right;

    public PatternInfo getRight() {
        return right;
    }

    public void setRight(PatternInfo right) {
        this.right = right;
    }
}
