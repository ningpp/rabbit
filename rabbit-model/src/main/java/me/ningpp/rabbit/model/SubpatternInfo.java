package me.ningpp.rabbit.model;

import java.util.List;

public class SubpatternInfo extends CommentElement {

    private NameColonInfo nameColon;

    public NameColonInfo getNameColon() {
        return nameColon;
    }

    public void setNameColon(NameColonInfo nameColon) {
        this.nameColon = nameColon;
    }

    private BaseExpressionColonInfo expressionColon;

    public BaseExpressionColonInfo getExpressionColon() {
        return expressionColon;
    }

    public void setExpressionColon(BaseExpressionColonInfo expressionColon) {
        this.expressionColon = expressionColon;
    }

    private PatternInfo pattern;

    public PatternInfo getPattern() {
        return pattern;
    }

    public void setPattern(PatternInfo pattern) {
        this.pattern = pattern;
    }
}
