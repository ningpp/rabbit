package me.ningpp.rabbit.model;

import java.util.List;

public class ParameterInfo {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
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

    private EqualsValueClauseInfo defaultInfo;

    public EqualsValueClauseInfo getDefaultInfo() {
        return defaultInfo;
    }

    public void setDefaultInfo(EqualsValueClauseInfo defaultInfo) {
        this.defaultInfo = defaultInfo;
    }
}
