package me.ningpp.rabbit.model;

import java.util.List;

public class ParameterListInfo extends CommentElement {

    private List<ParameterInfo> parameters;

    public List<ParameterInfo> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterInfo> parameters) {
        this.parameters = parameters;
    }
}
