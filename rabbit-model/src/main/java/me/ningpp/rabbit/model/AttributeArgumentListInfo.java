package me.ningpp.rabbit.model;

import java.util.List;

public class AttributeArgumentListInfo extends CommentElement {

    private List<AttributeArgumentInfo> arguments;

    public List<AttributeArgumentInfo> getArguments() {
        return arguments;
    }

    public void setArguments(List<AttributeArgumentInfo> arguments) {
        this.arguments = arguments;
    }
}
