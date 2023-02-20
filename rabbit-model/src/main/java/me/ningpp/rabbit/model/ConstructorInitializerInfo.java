package me.ningpp.rabbit.model;

import java.util.List;

public class ConstructorInitializerInfo {

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }

    private String thisOrBaseKeyword;

    public String getThisOrBaseKeyword() {
        return thisOrBaseKeyword;
    }

    public void setThisOrBaseKeyword(String thisOrBaseKeyword) {
        this.thisOrBaseKeyword = thisOrBaseKeyword;
    }

    private ArgumentListInfo argumentList;

    public ArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }
}
