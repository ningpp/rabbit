package me.ningpp.rabbit.model;

import java.util.List;

public class ObjectCreationExpressionInfo {

    private String newKeyword;

    public String getNewKeyword() {
        return newKeyword;
    }

    public void setNewKeyword(String newKeyword) {
        this.newKeyword = newKeyword;
    }

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

    private InitializerExpressionInfo initializer;

    public InitializerExpressionInfo getInitializer() {
        return initializer;
    }

    public void setInitializer(InitializerExpressionInfo initializer) {
        this.initializer = initializer;
    }
}
