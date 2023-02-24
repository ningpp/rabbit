package me.ningpp.rabbit.model;

import java.util.List;

public class ImplicitArrayCreationExpressionInfo extends CommentElement {

    private String newKeyword;

    public String getNewKeyword() {
        return newKeyword;
    }

    public void setNewKeyword(String newKeyword) {
        this.newKeyword = newKeyword;
    }

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private List<String> commas;

    public List<String> getCommas() {
        return commas;
    }

    public void setCommas(List<String> commas) {
        this.commas = commas;
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
