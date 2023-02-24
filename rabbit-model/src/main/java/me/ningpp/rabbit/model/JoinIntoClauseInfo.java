package me.ningpp.rabbit.model;

import java.util.List;

public class JoinIntoClauseInfo extends CommentElement {

    private String intoKeyword;

    public String getIntoKeyword() {
        return intoKeyword;
    }

    public void setIntoKeyword(String intoKeyword) {
        this.intoKeyword = intoKeyword;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
