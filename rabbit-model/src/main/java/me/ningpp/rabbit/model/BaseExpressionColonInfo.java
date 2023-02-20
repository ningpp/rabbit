package me.ningpp.rabbit.model;

import java.util.List;

public class BaseExpressionColonInfo {

    private NameColonInfo nameColonInfo;

    public NameColonInfo getNameColonInfo() {
        return nameColonInfo;
    }

    public void setNameColonInfo(NameColonInfo nameColonInfo) {
        this.nameColonInfo = nameColonInfo;
    }

    private ExpressionColonInfo expressionColonInfo;

    public ExpressionColonInfo getExpressionColonInfo() {
        return expressionColonInfo;
    }

    public void setExpressionColonInfo(ExpressionColonInfo expressionColonInfo) {
        this.expressionColonInfo = expressionColonInfo;
    }
}
