package me.ningpp.rabbit.model;

import java.util.List;

public class AliasQualifiedNameInfo extends CommentElement {

    private IdentifierNameInfo alias;

    public IdentifierNameInfo getAlias() {
        return alias;
    }

    public void setAlias(IdentifierNameInfo alias) {
        this.alias = alias;
    }

    private String colonColonToken;

    public String getColonColonToken() {
        return colonColonToken;
    }

    public void setColonColonToken(String colonColonToken) {
        this.colonColonToken = colonColonToken;
    }

    private SimpleNameInfo name;

    public SimpleNameInfo getName() {
        return name;
    }

    public void setName(SimpleNameInfo name) {
        this.name = name;
    }

    private boolean isVar;

    public boolean getIsVar() {
        return isVar;
    }

    public void setIsVar(boolean isVar) {
        this.isVar = isVar;
    }

    private boolean isUnmanaged;

    public boolean getIsUnmanaged() {
        return isUnmanaged;
    }

    public void setIsUnmanaged(boolean isUnmanaged) {
        this.isUnmanaged = isUnmanaged;
    }

    private boolean isNotNull;

    public boolean getIsNotNull() {
        return isNotNull;
    }

    public void setIsNotNull(boolean isNotNull) {
        this.isNotNull = isNotNull;
    }

    private boolean isNint;

    public boolean getIsNint() {
        return isNint;
    }

    public void setIsNint(boolean isNint) {
        this.isNint = isNint;
    }

    private boolean isNuint;

    public boolean getIsNuint() {
        return isNuint;
    }

    public void setIsNuint(boolean isNuint) {
        this.isNuint = isNuint;
    }
}
