package me.ningpp.rabbit.model;

import java.util.List;

public class ArgumentInfo extends CommentElement {

    private String refOrOutKeyword;

    public String getRefOrOutKeyword() {
        return refOrOutKeyword;
    }

    public void setRefOrOutKeyword(String refOrOutKeyword) {
        this.refOrOutKeyword = refOrOutKeyword;
    }

    private NameColonInfo nameColon;

    public NameColonInfo getNameColon() {
        return nameColon;
    }

    public void setNameColon(NameColonInfo nameColon) {
        this.nameColon = nameColon;
    }

    private String refKindKeyword;

    public String getRefKindKeyword() {
        return refKindKeyword;
    }

    public void setRefKindKeyword(String refKindKeyword) {
        this.refKindKeyword = refKindKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
