package me.ningpp.rabbit.model;

import java.util.List;

public class PropertyDeclarationInfo {

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

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    private EqualsValueClauseInfo initializer;

    public EqualsValueClauseInfo getInitializer() {
        return initializer;
    }

    public void setInitializer(EqualsValueClauseInfo initializer) {
        this.initializer = initializer;
    }
}
