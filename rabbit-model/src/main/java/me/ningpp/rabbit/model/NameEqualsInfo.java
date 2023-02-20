package me.ningpp.rabbit.model;

import java.util.List;

public class NameEqualsInfo {

    private IdentifierNameInfo name;

    public IdentifierNameInfo getName() {
        return name;
    }

    public void setName(IdentifierNameInfo name) {
        this.name = name;
    }

    private String equalsToken;

    public String getEqualsToken() {
        return equalsToken;
    }

    public void setEqualsToken(String equalsToken) {
        this.equalsToken = equalsToken;
    }
}
