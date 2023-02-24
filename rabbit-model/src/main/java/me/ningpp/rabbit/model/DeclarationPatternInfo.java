package me.ningpp.rabbit.model;

import java.util.List;

public class DeclarationPatternInfo extends CommentElement {

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private VariableDesignationInfo designation;

    public VariableDesignationInfo getDesignation() {
        return designation;
    }

    public void setDesignation(VariableDesignationInfo designation) {
        this.designation = designation;
    }
}
