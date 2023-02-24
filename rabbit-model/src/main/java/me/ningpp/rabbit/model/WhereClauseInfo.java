package me.ningpp.rabbit.model;

import java.util.List;

public class WhereClauseInfo extends CommentElement {

    private String whereKeyword;

    public String getWhereKeyword() {
        return whereKeyword;
    }

    public void setWhereKeyword(String whereKeyword) {
        this.whereKeyword = whereKeyword;
    }

    private ExpressionInfo condition;

    public ExpressionInfo getCondition() {
        return condition;
    }

    public void setCondition(ExpressionInfo condition) {
        this.condition = condition;
    }
}
