package me.ningpp.rabbit.model;

import java.util.List;

public class NameInfo extends CommentElement {

    private AliasQualifiedNameInfo aliasQualifiedNameInfo;

    public AliasQualifiedNameInfo getAliasQualifiedNameInfo() {
        return aliasQualifiedNameInfo;
    }

    public void setAliasQualifiedNameInfo(AliasQualifiedNameInfo aliasQualifiedNameInfo) {
        this.aliasQualifiedNameInfo = aliasQualifiedNameInfo;
    }

    private QualifiedNameInfo qualifiedNameInfo;

    public QualifiedNameInfo getQualifiedNameInfo() {
        return qualifiedNameInfo;
    }

    public void setQualifiedNameInfo(QualifiedNameInfo qualifiedNameInfo) {
        this.qualifiedNameInfo = qualifiedNameInfo;
    }

    private GenericNameInfo genericNameInfo;

    public GenericNameInfo getGenericNameInfo() {
        return genericNameInfo;
    }

    public void setGenericNameInfo(GenericNameInfo genericNameInfo) {
        this.genericNameInfo = genericNameInfo;
    }

    private IdentifierNameInfo identifierNameInfo;

    public IdentifierNameInfo getIdentifierNameInfo() {
        return identifierNameInfo;
    }

    public void setIdentifierNameInfo(IdentifierNameInfo identifierNameInfo) {
        this.identifierNameInfo = identifierNameInfo;
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
