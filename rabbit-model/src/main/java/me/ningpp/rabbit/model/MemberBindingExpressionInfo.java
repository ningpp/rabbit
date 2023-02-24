package me.ningpp.rabbit.model;

import java.util.List;

public class MemberBindingExpressionInfo extends CommentElement {

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
    }

    private SimpleNameInfo name;

    public SimpleNameInfo getName() {
        return name;
    }

    public void setName(SimpleNameInfo name) {
        this.name = name;
    }
}
