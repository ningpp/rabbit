package me.ningpp.rabbit.model;

import java.util.List;

public class BreakStatementInfo extends SourceLocation {

    private String breakKeyword;

    public String getBreakKeyword() {
        return breakKeyword;
    }

    public void setBreakKeyword(String breakKeyword) {
        this.breakKeyword = breakKeyword;
    }
}
