package me.ningpp.rabbit.model;

import java.util.List;

public class ExternAliasDirectiveInfo extends CommentElement {

    private String externKeyword;

    public String getExternKeyword() {
        return externKeyword;
    }

    public void setExternKeyword(String externKeyword) {
        this.externKeyword = externKeyword;
    }

    private String aliasKeyword;

    public String getAliasKeyword() {
        return aliasKeyword;
    }

    public void setAliasKeyword(String aliasKeyword) {
        this.aliasKeyword = aliasKeyword;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
