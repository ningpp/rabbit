package me.ningpp.rabbit.model;

import java.util.List;

public class ImplicitStackAllocArrayCreationExpressionInfo extends CommentElement {

    private String stackAllocKeyword;

    public String getStackAllocKeyword() {
        return stackAllocKeyword;
    }

    public void setStackAllocKeyword(String stackAllocKeyword) {
        this.stackAllocKeyword = stackAllocKeyword;
    }

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private String closeBracketToken;

    public String getCloseBracketToken() {
        return closeBracketToken;
    }

    public void setCloseBracketToken(String closeBracketToken) {
        this.closeBracketToken = closeBracketToken;
    }

    private InitializerExpressionInfo initializer;

    public InitializerExpressionInfo getInitializer() {
        return initializer;
    }

    public void setInitializer(InitializerExpressionInfo initializer) {
        this.initializer = initializer;
    }
}
