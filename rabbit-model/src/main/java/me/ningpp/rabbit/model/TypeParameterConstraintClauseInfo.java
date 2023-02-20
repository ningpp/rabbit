package me.ningpp.rabbit.model;

import java.util.List;

public class TypeParameterConstraintClauseInfo {

    private String whereKeyword;

    public String getWhereKeyword() {
        return whereKeyword;
    }

    public void setWhereKeyword(String whereKeyword) {
        this.whereKeyword = whereKeyword;
    }

    private IdentifierNameInfo name;

    public IdentifierNameInfo getName() {
        return name;
    }

    public void setName(IdentifierNameInfo name) {
        this.name = name;
    }

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }

    private List<TypeParameterConstraintInfo> constraints;

    public List<TypeParameterConstraintInfo> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<TypeParameterConstraintInfo> constraints) {
        this.constraints = constraints;
    }
}
