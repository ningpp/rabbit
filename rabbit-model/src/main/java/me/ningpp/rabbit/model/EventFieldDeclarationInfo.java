package me.ningpp.rabbit.model;

import java.util.List;

public class EventFieldDeclarationInfo {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String eventKeyword;

    public String getEventKeyword() {
        return eventKeyword;
    }

    public void setEventKeyword(String eventKeyword) {
        this.eventKeyword = eventKeyword;
    }

    private VariableDeclarationInfo declaration;

    public VariableDeclarationInfo getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclarationInfo declaration) {
        this.declaration = declaration;
    }
}
