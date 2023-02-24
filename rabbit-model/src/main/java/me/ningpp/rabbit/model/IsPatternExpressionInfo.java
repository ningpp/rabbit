package me.ningpp.rabbit.model;

import java.util.List;

public class IsPatternExpressionInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private String isKeyword;

    public String getIsKeyword() {
        return isKeyword;
    }

    public void setIsKeyword(String isKeyword) {
        this.isKeyword = isKeyword;
    }

    private PatternInfo pattern;

    public PatternInfo getPattern() {
        return pattern;
    }

    public void setPattern(PatternInfo pattern) {
        this.pattern = pattern;
    }
}
