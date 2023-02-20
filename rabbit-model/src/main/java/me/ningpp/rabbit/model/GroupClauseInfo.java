package me.ningpp.rabbit.model;

import java.util.List;

public class GroupClauseInfo {

    private String groupKeyword;

    public String getGroupKeyword() {
        return groupKeyword;
    }

    public void setGroupKeyword(String groupKeyword) {
        this.groupKeyword = groupKeyword;
    }

    private ExpressionInfo groupExpression;

    public ExpressionInfo getGroupExpression() {
        return groupExpression;
    }

    public void setGroupExpression(ExpressionInfo groupExpression) {
        this.groupExpression = groupExpression;
    }

    private String byKeyword;

    public String getByKeyword() {
        return byKeyword;
    }

    public void setByKeyword(String byKeyword) {
        this.byKeyword = byKeyword;
    }

    private ExpressionInfo byExpression;

    public ExpressionInfo getByExpression() {
        return byExpression;
    }

    public void setByExpression(ExpressionInfo byExpression) {
        this.byExpression = byExpression;
    }
}
