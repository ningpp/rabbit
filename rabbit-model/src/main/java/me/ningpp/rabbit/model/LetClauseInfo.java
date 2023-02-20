package me.ningpp.rabbit.model;

import java.util.List;

public class LetClauseInfo {

    private String letKeyword;

    public String getLetKeyword() {
        return letKeyword;
    }

    public void setLetKeyword(String letKeyword) {
        this.letKeyword = letKeyword;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private String equalsToken;

    public String getEqualsToken() {
        return equalsToken;
    }

    public void setEqualsToken(String equalsToken) {
        this.equalsToken = equalsToken;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
