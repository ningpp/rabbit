package me.ningpp.rabbit.model;

import java.util.List;

public class OperatorDeclarationInfo extends CommentElement {

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

    private String operatorToken;

    public String getOperatorToken() {
        return operatorToken;
    }

    public void setOperatorToken(String operatorToken) {
        this.operatorToken = operatorToken;
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
