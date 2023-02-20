package me.ningpp.rabbit.model;

import java.util.List;

public class JoinClauseInfo {

    private String joinKeyword;

    public String getJoinKeyword() {
        return joinKeyword;
    }

    public void setJoinKeyword(String joinKeyword) {
        this.joinKeyword = joinKeyword;
    }

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private String inKeyword;

    public String getInKeyword() {
        return inKeyword;
    }

    public void setInKeyword(String inKeyword) {
        this.inKeyword = inKeyword;
    }

    private ExpressionInfo inExpression;

    public ExpressionInfo getInExpression() {
        return inExpression;
    }

    public void setInExpression(ExpressionInfo inExpression) {
        this.inExpression = inExpression;
    }

    private String onKeyword;

    public String getOnKeyword() {
        return onKeyword;
    }

    public void setOnKeyword(String onKeyword) {
        this.onKeyword = onKeyword;
    }

    private ExpressionInfo leftExpression;

    public ExpressionInfo getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(ExpressionInfo leftExpression) {
        this.leftExpression = leftExpression;
    }

    private String equalsKeyword;

    public String getEqualsKeyword() {
        return equalsKeyword;
    }

    public void setEqualsKeyword(String equalsKeyword) {
        this.equalsKeyword = equalsKeyword;
    }

    private ExpressionInfo rightExpression;

    public ExpressionInfo getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(ExpressionInfo rightExpression) {
        this.rightExpression = rightExpression;
    }

    private JoinIntoClauseInfo into;

    public JoinIntoClauseInfo getInto() {
        return into;
    }

    public void setInto(JoinIntoClauseInfo into) {
        this.into = into;
    }
}
