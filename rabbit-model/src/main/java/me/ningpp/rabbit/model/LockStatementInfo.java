package me.ningpp.rabbit.model;

import java.util.List;

public class LockStatementInfo {

    private String lockKeyword;

    public String getLockKeyword() {
        return lockKeyword;
    }

    public void setLockKeyword(String lockKeyword) {
        this.lockKeyword = lockKeyword;
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
