package me.ningpp.rabbit.model;

import java.util.List;

public class LocalDeclarationStatementInfo extends SourceLocation {

    private boolean isConst;

    public boolean getIsConst() {
        return isConst;
    }

    public void setIsConst(boolean isConst) {
        this.isConst = isConst;
    }

    private String awaitKeyword;

    public String getAwaitKeyword() {
        return awaitKeyword;
    }

    public void setAwaitKeyword(String awaitKeyword) {
        this.awaitKeyword = awaitKeyword;
    }

    private String usingKeyword;

    public String getUsingKeyword() {
        return usingKeyword;
    }

    public void setUsingKeyword(String usingKeyword) {
        this.usingKeyword = usingKeyword;
    }

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private VariableDeclarationInfo declaration;

    public VariableDeclarationInfo getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclarationInfo declaration) {
        this.declaration = declaration;
    }
}
