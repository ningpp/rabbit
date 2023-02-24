package me.ningpp.rabbit.model;

import java.util.List;

public class FromClauseInfo extends CommentElement {

    private String fromKeyword;

    public String getFromKeyword() {
        return fromKeyword;
    }

    public void setFromKeyword(String fromKeyword) {
        this.fromKeyword = fromKeyword;
    }

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private String inKeyword;

    public String getInKeyword() {
        return inKeyword;
    }

    public void setInKeyword(String inKeyword) {
        this.inKeyword = inKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
