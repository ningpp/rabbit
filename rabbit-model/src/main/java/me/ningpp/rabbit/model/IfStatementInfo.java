package me.ningpp.rabbit.model;

import java.util.List;

public class IfStatementInfo extends SourceLocation {

    private String ifKeyword;

    public String getIfKeyword() {
        return ifKeyword;
    }

    public void setIfKeyword(String ifKeyword) {
        this.ifKeyword = ifKeyword;
    }

    private ExpressionInfo condition;

    public ExpressionInfo getCondition() {
        return condition;
    }

    public void setCondition(ExpressionInfo condition) {
        this.condition = condition;
    }

    private StatementInfo statement;

    public StatementInfo getStatement() {
        return statement;
    }

    public void setStatement(StatementInfo statement) {
        this.statement = statement;
    }

    private ElseClauseInfo elseInfo;

    public ElseClauseInfo getElseInfo() {
        return elseInfo;
    }

    public void setElseInfo(ElseClauseInfo elseInfo) {
        this.elseInfo = elseInfo;
    }
}
