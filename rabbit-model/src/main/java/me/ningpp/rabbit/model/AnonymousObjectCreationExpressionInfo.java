package me.ningpp.rabbit.model;

import java.util.List;

public class AnonymousObjectCreationExpressionInfo {

    private String newKeyword;

    public String getNewKeyword() {
        return newKeyword;
    }

    public void setNewKeyword(String newKeyword) {
        this.newKeyword = newKeyword;
    }

    private List<AnonymousObjectMemberDeclaratorInfo> initializers;

    public List<AnonymousObjectMemberDeclaratorInfo> getInitializers() {
        return initializers;
    }

    public void setInitializers(List<AnonymousObjectMemberDeclaratorInfo> initializers) {
        this.initializers = initializers;
    }
}
