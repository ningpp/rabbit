package me.ningpp.rabbit.model;

import java.util.List;

public class UsingDirectiveInfo {

    private String globalKeyword;

    public String getGlobalKeyword() {
        return globalKeyword;
    }

    public void setGlobalKeyword(String globalKeyword) {
        this.globalKeyword = globalKeyword;
    }

    private String usingKeyword;

    public String getUsingKeyword() {
        return usingKeyword;
    }

    public void setUsingKeyword(String usingKeyword) {
        this.usingKeyword = usingKeyword;
    }

    private String staticKeyword;

    public String getStaticKeyword() {
        return staticKeyword;
    }

    public void setStaticKeyword(String staticKeyword) {
        this.staticKeyword = staticKeyword;
    }

    private NameEqualsInfo alias;

    public NameEqualsInfo getAlias() {
        return alias;
    }

    public void setAlias(NameEqualsInfo alias) {
        this.alias = alias;
    }

    private NameInfo name;

    public NameInfo getName() {
        return name;
    }

    public void setName(NameInfo name) {
        this.name = name;
    }
}
