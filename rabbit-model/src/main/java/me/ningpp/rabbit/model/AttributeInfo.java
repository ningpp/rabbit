package me.ningpp.rabbit.model;

import java.util.List;

public class AttributeInfo extends CommentElement {

    private NameInfo name;

    public NameInfo getName() {
        return name;
    }

    public void setName(NameInfo name) {
        this.name = name;
    }

    private AttributeArgumentListInfo argumentList;

    public AttributeArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(AttributeArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }
}
