package me.ningpp.rabbit.model;

import java.util.List;

public class DestructorDeclarationInfo extends CommentElement {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String tildeToken;

    public String getTildeToken() {
        return tildeToken;
    }

    public void setTildeToken(String tildeToken) {
        this.tildeToken = tildeToken;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
