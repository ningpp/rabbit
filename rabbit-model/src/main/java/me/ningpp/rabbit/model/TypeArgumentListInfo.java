package me.ningpp.rabbit.model;

import java.util.List;

public class TypeArgumentListInfo {

    private String lessThanToken;

    public String getLessThanToken() {
        return lessThanToken;
    }

    public void setLessThanToken(String lessThanToken) {
        this.lessThanToken = lessThanToken;
    }

    private List<TypeInfo> arguments;

    public List<TypeInfo> getArguments() {
        return arguments;
    }

    public void setArguments(List<TypeInfo> arguments) {
        this.arguments = arguments;
    }

    private String greaterThanToken;

    public String getGreaterThanToken() {
        return greaterThanToken;
    }

    public void setGreaterThanToken(String greaterThanToken) {
        this.greaterThanToken = greaterThanToken;
    }
}
