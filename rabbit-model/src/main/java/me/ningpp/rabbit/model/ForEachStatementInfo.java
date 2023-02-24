package me.ningpp.rabbit.model;

import java.util.List;

public class ForEachStatementInfo extends SourceLocation {

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
