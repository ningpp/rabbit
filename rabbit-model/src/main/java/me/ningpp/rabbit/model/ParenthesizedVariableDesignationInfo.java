package me.ningpp.rabbit.model;

import java.util.List;

public class ParenthesizedVariableDesignationInfo extends CommentElement {

    private List<VariableDesignationInfo> variables;

    public List<VariableDesignationInfo> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableDesignationInfo> variables) {
        this.variables = variables;
    }
}
