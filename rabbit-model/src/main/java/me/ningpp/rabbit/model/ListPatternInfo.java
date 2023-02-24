package me.ningpp.rabbit.model;

import java.util.List;

public class ListPatternInfo extends CommentElement {

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private List<PatternInfo> patterns;

    public List<PatternInfo> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<PatternInfo> patterns) {
        this.patterns = patterns;
    }

    private String closeBracketToken;

    public String getCloseBracketToken() {
        return closeBracketToken;
    }

    public void setCloseBracketToken(String closeBracketToken) {
        this.closeBracketToken = closeBracketToken;
    }

    private VariableDesignationInfo designation;

    public VariableDesignationInfo getDesignation() {
        return designation;
    }

    public void setDesignation(VariableDesignationInfo designation) {
        this.designation = designation;
    }
}
