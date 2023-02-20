package me.ningpp.rabbit.model;

import java.util.List;

public class BracketedArgumentListInfo {

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private List<ArgumentInfo> arguments;

    public List<ArgumentInfo> getArguments() {
        return arguments;
    }

    public void setArguments(List<ArgumentInfo> arguments) {
        this.arguments = arguments;
    }

    private String closeBracketToken;

    public String getCloseBracketToken() {
        return closeBracketToken;
    }

    public void setCloseBracketToken(String closeBracketToken) {
        this.closeBracketToken = closeBracketToken;
    }
}
