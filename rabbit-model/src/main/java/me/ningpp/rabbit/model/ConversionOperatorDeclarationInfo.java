package me.ningpp.rabbit.model;

import java.util.List;

public class ConversionOperatorDeclarationInfo {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String implicitOrExplicitKeyword;

    public String getImplicitOrExplicitKeyword() {
        return implicitOrExplicitKeyword;
    }

    public void setImplicitOrExplicitKeyword(String implicitOrExplicitKeyword) {
        this.implicitOrExplicitKeyword = implicitOrExplicitKeyword;
    }

    private ExplicitInterfaceSpecifierInfo explicitInterfaceSpecifier;

    public ExplicitInterfaceSpecifierInfo getExplicitInterfaceSpecifier() {
        return explicitInterfaceSpecifier;
    }

    public void setExplicitInterfaceSpecifier(ExplicitInterfaceSpecifierInfo explicitInterfaceSpecifier) {
        this.explicitInterfaceSpecifier = explicitInterfaceSpecifier;
    }

    private String operatorKeyword;

    public String getOperatorKeyword() {
        return operatorKeyword;
    }

    public void setOperatorKeyword(String operatorKeyword) {
        this.operatorKeyword = operatorKeyword;
    }

    private String checkedKeyword;

    public String getCheckedKeyword() {
        return checkedKeyword;
    }

    public void setCheckedKeyword(String checkedKeyword) {
        this.checkedKeyword = checkedKeyword;
    }

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private ParameterListInfo parameterList;

    public ParameterListInfo getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterListInfo parameterList) {
        this.parameterList = parameterList;
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
