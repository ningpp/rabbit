package me.ningpp.rabbit.model;

import java.util.List;

public class ForStatementInfo extends SourceLocation {

    private String forKeyword;

    public String getForKeyword() {
        return forKeyword;
    }

    public void setForKeyword(String forKeyword) {
        this.forKeyword = forKeyword;
    }

    private VariableDeclarationInfo declaration;

    public VariableDeclarationInfo getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclarationInfo declaration) {
        this.declaration = declaration;
    }

    private List<ExpressionInfo> initializers;

    public List<ExpressionInfo> getInitializers() {
        return initializers;
    }

    public void setInitializers(List<ExpressionInfo> initializers) {
        this.initializers = initializers;
    }

    private String firstSemicolonToken;

    public String getFirstSemicolonToken() {
        return firstSemicolonToken;
    }

    public void setFirstSemicolonToken(String firstSemicolonToken) {
        this.firstSemicolonToken = firstSemicolonToken;
    }

    private ExpressionInfo condition;

    public ExpressionInfo getCondition() {
        return condition;
    }

    public void setCondition(ExpressionInfo condition) {
        this.condition = condition;
    }

    private String secondSemicolonToken;

    public String getSecondSemicolonToken() {
        return secondSemicolonToken;
    }

    public void setSecondSemicolonToken(String secondSemicolonToken) {
        this.secondSemicolonToken = secondSemicolonToken;
    }

    private List<ExpressionInfo> incrementors;

    public List<ExpressionInfo> getIncrementors() {
        return incrementors;
    }

    public void setIncrementors(List<ExpressionInfo> incrementors) {
        this.incrementors = incrementors;
    }

    private StatementInfo statement;

    public StatementInfo getStatement() {
        return statement;
    }

    public void setStatement(StatementInfo statement) {
        this.statement = statement;
    }
}
