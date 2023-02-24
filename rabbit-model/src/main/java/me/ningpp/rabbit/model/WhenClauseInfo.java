package me.ningpp.rabbit.model;

import java.util.List;

public class WhenClauseInfo extends CommentElement {

    private String whenKeyword;

    public String getWhenKeyword() {
        return whenKeyword;
    }

    public void setWhenKeyword(String whenKeyword) {
        this.whenKeyword = whenKeyword;
    }

    private ExpressionInfo condition;

    public ExpressionInfo getCondition() {
        return condition;
    }

    public void setCondition(ExpressionInfo condition) {
        this.condition = condition;
    }
}
