package me.ningpp.rabbit.model;

import java.util.List;

public class FunctionPointerParameterListInfo extends CommentElement {

    private String lessThanToken;

    public String getLessThanToken() {
        return lessThanToken;
    }

    public void setLessThanToken(String lessThanToken) {
        this.lessThanToken = lessThanToken;
    }

    private List<FunctionPointerParameterInfo> parameters;

    public List<FunctionPointerParameterInfo> getParameters() {
        return parameters;
    }

    public void setParameters(List<FunctionPointerParameterInfo> parameters) {
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
