package me.ningpp.rabbit.model;

import java.util.List;

public class DoStatementInfo extends SourceLocation {

    private String doKeyword;

    public String getDoKeyword() {
        return doKeyword;
    }

    public void setDoKeyword(String doKeyword) {
        this.doKeyword = doKeyword;
    }

    private StatementInfo statement;

    public StatementInfo getStatement() {
        return statement;
    }

    public void setStatement(StatementInfo statement) {
        this.statement = statement;
    }

    private String whileKeyword;

    public String getWhileKeyword() {
        return whileKeyword;
    }

    public void setWhileKeyword(String whileKeyword) {
        this.whileKeyword = whileKeyword;
    }

    private ExpressionInfo condition;

    public ExpressionInfo getCondition() {
        return condition;
    }

    public void setCondition(ExpressionInfo condition) {
        this.condition = condition;
    }
}
