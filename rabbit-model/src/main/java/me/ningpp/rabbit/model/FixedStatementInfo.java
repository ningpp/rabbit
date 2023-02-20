package me.ningpp.rabbit.model;

import java.util.List;

public class FixedStatementInfo {

    private String fixedKeyword;

    public String getFixedKeyword() {
        return fixedKeyword;
    }

    public void setFixedKeyword(String fixedKeyword) {
        this.fixedKeyword = fixedKeyword;
    }

    private VariableDeclarationInfo declaration;

    public VariableDeclarationInfo getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclarationInfo declaration) {
        this.declaration = declaration;
    }

    private StatementInfo statement;

    public StatementInfo getStatement() {
        return statement;
    }

    public void setStatement(StatementInfo statement) {
        this.statement = statement;
    }
}
