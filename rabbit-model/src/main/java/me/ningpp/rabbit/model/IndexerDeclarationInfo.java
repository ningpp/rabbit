package me.ningpp.rabbit.model;

import java.util.List;

public class IndexerDeclarationInfo extends CommentElement {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private ExplicitInterfaceSpecifierInfo explicitInterfaceSpecifier;

    public ExplicitInterfaceSpecifierInfo getExplicitInterfaceSpecifier() {
        return explicitInterfaceSpecifier;
    }

    public void setExplicitInterfaceSpecifier(ExplicitInterfaceSpecifierInfo explicitInterfaceSpecifier) {
        this.explicitInterfaceSpecifier = explicitInterfaceSpecifier;
    }

    private String thisKeyword;

    public String getThisKeyword() {
        return thisKeyword;
    }

    public void setThisKeyword(String thisKeyword) {
        this.thisKeyword = thisKeyword;
    }

    private BracketedParameterListInfo parameterList;

    public BracketedParameterListInfo getParameterList() {
        return parameterList;
    }

    public void setParameterList(BracketedParameterListInfo parameterList) {
        this.parameterList = parameterList;
    }

    private AccessorListInfo accessorList;

    public AccessorListInfo getAccessorList() {
        return accessorList;
    }

    public void setAccessorList(AccessorListInfo accessorList) {
        this.accessorList = accessorList;
    }

    private ArrowExpressionClauseInfo expressionBody;

    public ArrowExpressionClauseInfo getExpressionBody() {
        return expressionBody;
    }

    public void setExpressionBody(ArrowExpressionClauseInfo expressionBody) {
        this.expressionBody = expressionBody;
    }
}
