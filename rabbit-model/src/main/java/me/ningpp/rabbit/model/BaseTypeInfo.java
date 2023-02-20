package me.ningpp.rabbit.model;

import java.util.List;

public class BaseTypeInfo {

    private SimpleBaseTypeInfo simpleBaseTypeInfo;

    public SimpleBaseTypeInfo getSimpleBaseTypeInfo() {
        return simpleBaseTypeInfo;
    }

    public void setSimpleBaseTypeInfo(SimpleBaseTypeInfo simpleBaseTypeInfo) {
        this.simpleBaseTypeInfo = simpleBaseTypeInfo;
    }

    private PrimaryConstructorBaseTypeInfo primaryConstructorBaseTypeInfo;

    public PrimaryConstructorBaseTypeInfo getPrimaryConstructorBaseTypeInfo() {
        return primaryConstructorBaseTypeInfo;
    }

    public void setPrimaryConstructorBaseTypeInfo(PrimaryConstructorBaseTypeInfo primaryConstructorBaseTypeInfo) {
        this.primaryConstructorBaseTypeInfo = primaryConstructorBaseTypeInfo;
    }
}
