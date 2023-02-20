package me.ningpp.rabbit.model;

import java.util.List;

public class UsingStatementInfo {

    private String awaitKeyword;

    public String getAwaitKeyword() {
        return awaitKeyword;
    }

    public void setAwaitKeyword(String awaitKeyword) {
        this.awaitKeyword = awaitKeyword;
    }

    private String usingKeyword;

    public String getUsingKeyword() {
        return usingKeyword;
    }

    public void setUsingKeyword(String usingKeyword) {
        this.usingKeyword = usingKeyword;
    }

    private VariableDeclarationInfo declaration;

    public VariableDeclarationInfo getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclarationInfo declaration) {
        this.declaration = declaration;
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
