package me.ningpp.rabbit.model;

import java.util.List;

public class SwitchExpressionArmInfo extends CommentElement {

    private PatternInfo pattern;

    public PatternInfo getPattern() {
        return pattern;
    }

    public void setPattern(PatternInfo pattern) {
        this.pattern = pattern;
    }

    private WhenClauseInfo whenClause;

    public WhenClauseInfo getWhenClause() {
        return whenClause;
    }

    public void setWhenClause(WhenClauseInfo whenClause) {
        this.whenClause = whenClause;
    }

    private String equalsGreaterThanToken;

    public String getEqualsGreaterThanToken() {
        return equalsGreaterThanToken;
    }

    public void setEqualsGreaterThanToken(String equalsGreaterThanToken) {
        this.equalsGreaterThanToken = equalsGreaterThanToken;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
