package me.ningpp.rabbit.model;

import java.util.List;

public class MethodDeclarationInfo extends CommentElement {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private TypeInfo returnType;

    public TypeInfo getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeInfo returnType) {
        this.returnType = returnType;
    }

    private ExplicitInterfaceSpecifierInfo explicitInterfaceSpecifier;

    public ExplicitInterfaceSpecifierInfo getExplicitInterfaceSpecifier() {
        return explicitInterfaceSpecifier;
    }

    public void setExplicitInterfaceSpecifier(ExplicitInterfaceSpecifierInfo explicitInterfaceSpecifier) {
        this.explicitInterfaceSpecifier = explicitInterfaceSpecifier;
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

    private BlockInfo body;

    public BlockInfo getBody() {
        return body;
    }

    public void setBody(BlockInfo body) {
        this.body = body;
    }

    private ArrowExpressionClauseInfo expressionBody;

    public ArrowExpressionClauseInfo getExpressionBody() {
        return expressionBody;
    }

    public void setExpressionBody(ArrowExpressionClauseInfo expressionBody) {
        this.expressionBody = expressionBody;
    }
}
