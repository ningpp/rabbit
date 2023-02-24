package me.ningpp.rabbit.model;

import java.util.List;

public class ElementBindingExpressionInfo extends CommentElement {

    private BracketedArgumentListInfo argumentList;

    public BracketedArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(BracketedArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }
}
