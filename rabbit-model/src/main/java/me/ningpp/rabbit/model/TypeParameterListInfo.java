package me.ningpp.rabbit.model;

import java.util.List;

public class TypeParameterListInfo {

    private String lessThanToken;

    public String getLessThanToken() {
        return lessThanToken;
    }

    public void setLessThanToken(String lessThanToken) {
        this.lessThanToken = lessThanToken;
    }

    private List<TypeParameterInfo> parameters;

    public List<TypeParameterInfo> getParameters() {
        return parameters;
    }

    public void setParameters(List<TypeParameterInfo> parameters) {
        this.parameters = parameters;
    }

    private String greaterThanToken;

    public String getGreaterThanToken() {
        return greaterThanToken;
    }

    public void setGreaterThanToken(String greaterThanToken) {
        this.greaterThanToken = greaterThanToken;
    }
}
