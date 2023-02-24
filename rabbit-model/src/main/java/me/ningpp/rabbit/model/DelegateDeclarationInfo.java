package me.ningpp.rabbit.model;

import java.util.List;

public class DelegateDeclarationInfo extends CommentElement {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String delegateKeyword;

    public String getDelegateKeyword() {
        return delegateKeyword;
    }

    public void setDelegateKeyword(String delegateKeyword) {
        this.delegateKeyword = delegateKeyword;
    }

    private TypeInfo returnType;

    public TypeInfo getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeInfo returnType) {
        this.returnType = returnType;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private TypeParameterListInfo typeParameterList;

    public TypeParameterListInfo getTypeParameterList() {
        return typeParameterList;
    }

    public void setTypeParameterList(TypeParameterListInfo typeParameterList) {
        this.typeParameterList = typeParameterList;
    }

    private ParameterListInfo parameterList;

    public ParameterListInfo getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterListInfo parameterList) {
        this.parameterList = parameterList;
    }

    private List<TypeParameterConstraintClauseInfo> constraintClauses;

    public List<TypeParameterConstraintClauseInfo> getConstraintClauses() {
        return constraintClauses;
    }

    public void setConstraintClauses(List<TypeParameterConstraintClauseInfo> constraintClauses) {
        this.constraintClauses = constraintClauses;
    }
}
