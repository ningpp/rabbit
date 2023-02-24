package me.ningpp.rabbit.model;

import java.util.List;

public class PrimaryConstructorBaseTypeInfo extends CommentElement {

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private ArgumentListInfo argumentList;

    public ArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }
}
