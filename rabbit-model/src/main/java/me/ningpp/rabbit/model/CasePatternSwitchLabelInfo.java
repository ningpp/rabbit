package me.ningpp.rabbit.model;

import java.util.List;

public class CasePatternSwitchLabelInfo extends CommentElement {

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private PatternInfo pattern;

    public PatternInfo getPattern() {
        return pattern;
    }

    public void setPattern(PatternInfo pattern) {
        this.pattern = pattern;
    }

    private WhenClauseInfo whenClause;

    public WhenClauseInfo getWhenClause() {
        return whenClause;
    }

    public void setWhenClause(WhenClauseInfo whenClause) {
        this.whenClause = whenClause;
    }

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }
}
