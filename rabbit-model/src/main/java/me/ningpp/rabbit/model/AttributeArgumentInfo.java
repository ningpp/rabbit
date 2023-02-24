package me.ningpp.rabbit.model;

import java.util.List;

public class AttributeArgumentInfo extends CommentElement {

    private NameEqualsInfo nameEquals;

    public NameEqualsInfo getNameEquals() {
        return nameEquals;
    }

    public void setNameEquals(NameEqualsInfo nameEquals) {
        this.nameEquals = nameEquals;
    }

    private NameColonInfo nameColon;

    public NameColonInfo getNameColon() {
        return nameColon;
    }

    public void setNameColon(NameColonInfo nameColon) {
        this.nameColon = nameColon;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
