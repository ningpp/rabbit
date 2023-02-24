package me.ningpp.rabbit.model;

import java.util.List;

public class NameColonInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
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
}
