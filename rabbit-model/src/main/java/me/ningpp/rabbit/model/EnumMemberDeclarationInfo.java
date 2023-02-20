package me.ningpp.rabbit.model;

import java.util.List;

public class EnumMemberDeclarationInfo {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private EqualsValueClauseInfo equalsValue;

    public EqualsValueClauseInfo getEqualsValue() {
        return equalsValue;
    }

    public void setEqualsValue(EqualsValueClauseInfo equalsValue) {
        this.equalsValue = equalsValue;
    }
}
