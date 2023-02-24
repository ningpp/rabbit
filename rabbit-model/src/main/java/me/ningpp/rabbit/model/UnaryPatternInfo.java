package me.ningpp.rabbit.model;

import java.util.List;

public class UnaryPatternInfo extends CommentElement {

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }

    private PatternInfo pattern;

    public PatternInfo getPattern() {
        return pattern;
    }

    public void setPattern(PatternInfo pattern) {
        this.pattern = pattern;
    }
}
