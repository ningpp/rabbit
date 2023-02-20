package me.ningpp.rabbit.model;

import java.util.List;

public class ArrayCreationExpressionInfo {

    private String newKeyword;

    public String getNewKeyword() {
        return newKeyword;
    }

    public void setNewKeyword(String newKeyword) {
        this.newKeyword = newKeyword;
    }

    private ArrayTypeInfo type;

    public ArrayTypeInfo getType() {
        return type;
    }

    public void setType(ArrayTypeInfo type) {
        this.type = type;
    }

    private InitializerExpressionInfo initializer;

    public InitializerExpressionInfo getInitializer() {
        return initializer;
    }

    public void setInitializer(InitializerExpressionInfo initializer) {
        this.initializer = initializer;
    }
}
