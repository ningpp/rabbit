package me.ningpp.rabbit.model;

import java.util.List;

public class StackAllocArrayCreationExpressionInfo {

    private String stackAllocKeyword;

    public String getStackAllocKeyword() {
        return stackAllocKeyword;
    }

    public void setStackAllocKeyword(String stackAllocKeyword) {
        this.stackAllocKeyword = stackAllocKeyword;
    }

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
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
