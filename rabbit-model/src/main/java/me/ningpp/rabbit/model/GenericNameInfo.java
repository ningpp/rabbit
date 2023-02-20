package me.ningpp.rabbit.model;

import java.util.List;

public class GenericNameInfo {

    private boolean isUnboundGenericName;

    public boolean getIsUnboundGenericName() {
        return isUnboundGenericName;
    }

    public void setIsUnboundGenericName(boolean isUnboundGenericName) {
        this.isUnboundGenericName = isUnboundGenericName;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private TypeArgumentListInfo typeArgumentList;

    public TypeArgumentListInfo getTypeArgumentList() {
        return typeArgumentList;
    }

    public void setTypeArgumentList(TypeArgumentListInfo typeArgumentList) {
        this.typeArgumentList = typeArgumentList;
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
