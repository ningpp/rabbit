package me.ningpp.rabbit.model;

import java.util.List;

public class AnonymousObjectMemberDeclaratorInfo {

    private NameEqualsInfo nameEquals;

    public NameEqualsInfo getNameEquals() {
        return nameEquals;
    }

    public void setNameEquals(NameEqualsInfo nameEquals) {
        this.nameEquals = nameEquals;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
