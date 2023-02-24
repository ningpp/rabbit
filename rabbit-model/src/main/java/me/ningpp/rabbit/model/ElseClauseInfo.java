package me.ningpp.rabbit.model;

import java.util.List;

public class ElseClauseInfo extends CommentElement {

    private String elseKeyword;

    public String getElseKeyword() {
        return elseKeyword;
    }

    public void setElseKeyword(String elseKeyword) {
        this.elseKeyword = elseKeyword;
    }

    private StatementInfo statement;

    public StatementInfo getStatement() {
        return statement;
    }

    public void setStatement(StatementInfo statement) {
        this.statement = statement;
    }
}
