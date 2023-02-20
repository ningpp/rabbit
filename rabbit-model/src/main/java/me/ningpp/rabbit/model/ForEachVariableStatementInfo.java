package me.ningpp.rabbit.model;

import java.util.List;

public class ForEachVariableStatementInfo {

    private String awaitKeyword;

    public String getAwaitKeyword() {
        return awaitKeyword;
    }

    public void setAwaitKeyword(String awaitKeyword) {
        this.awaitKeyword = awaitKeyword;
    }

    private String forEachKeyword;

    public String getForEachKeyword() {
        return forEachKeyword;
    }

    public void setForEachKeyword(String forEachKeyword) {
        this.forEachKeyword = forEachKeyword;
    }

    private ExpressionInfo variable;

    public ExpressionInfo getVariable() {
        return variable;
    }

    public void setVariable(ExpressionInfo variable) {
        this.variable = variable;
    }

    private String inKeyword;

    public String getInKeyword() {
        return inKeyword;
    }

    public void setInKeyword(String inKeyword) {
        this.inKeyword = inKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private StatementInfo statement;

    public StatementInfo getStatement() {
        return statement;
    }

    public void setStatement(StatementInfo statement) {
        this.statement = statement;
    }
}
