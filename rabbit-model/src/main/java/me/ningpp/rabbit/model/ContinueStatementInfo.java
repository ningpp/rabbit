package me.ningpp.rabbit.model;

import java.util.List;

public class ContinueStatementInfo extends SourceLocation {

    private String continueKeyword;

    public String getContinueKeyword() {
        return continueKeyword;
    }

    public void setContinueKeyword(String continueKeyword) {
        this.continueKeyword = continueKeyword;
    }
}
