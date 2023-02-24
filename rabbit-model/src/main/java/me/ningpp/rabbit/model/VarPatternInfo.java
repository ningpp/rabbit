package me.ningpp.rabbit.model;

import java.util.List;

public class VarPatternInfo extends CommentElement {

    private String varKeyword;

    public String getVarKeyword() {
        return varKeyword;
    }

    public void setVarKeyword(String varKeyword) {
        this.varKeyword = varKeyword;
    }

    private VariableDesignationInfo designation;

    public VariableDesignationInfo getDesignation() {
        return designation;
    }

    public void setDesignation(VariableDesignationInfo designation) {
        this.designation = designation;
    }
}
