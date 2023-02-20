package me.ningpp.rabbit.model;

import java.util.List;

public class VariableDeclaratorInfo {

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private BracketedArgumentListInfo argumentList;

    public BracketedArgumentListInfo getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(BracketedArgumentListInfo argumentList) {
        this.argumentList = argumentList;
    }

    private EqualsValueClauseInfo initializer;

    public EqualsValueClauseInfo getInitializer() {
        return initializer;
    }

    public void setInitializer(EqualsValueClauseInfo initializer) {
        this.initializer = initializer;
    }
}
