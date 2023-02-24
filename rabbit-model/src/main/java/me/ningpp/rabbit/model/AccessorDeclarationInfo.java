package me.ningpp.rabbit.model;

import java.util.List;

public class AccessorDeclarationInfo extends CommentElement {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
