package me.ningpp.rabbit.model;

import java.util.List;

public class EqualsValueClauseInfo extends CommentElement {

    private String equalsToken;

    public String getEqualsToken() {
        return equalsToken;
    }

    public void setEqualsToken(String equalsToken) {
        this.equalsToken = equalsToken;
    }

    private ExpressionInfo value;

    public ExpressionInfo getValue() {
        return value;
    }

    public void setValue(ExpressionInfo value) {
        this.value = value;
    }
}
