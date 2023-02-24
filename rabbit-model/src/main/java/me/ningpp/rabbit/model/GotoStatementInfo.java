package me.ningpp.rabbit.model;

import java.util.List;

public class GotoStatementInfo extends SourceLocation {

    private String gotoKeyword;

    public String getGotoKeyword() {
        return gotoKeyword;
    }

    public void setGotoKeyword(String gotoKeyword) {
        this.gotoKeyword = gotoKeyword;
    }

    private String caseOrDefaultKeyword;

    public String getCaseOrDefaultKeyword() {
        return caseOrDefaultKeyword;
    }

    public void setCaseOrDefaultKeyword(String caseOrDefaultKeyword) {
        this.caseOrDefaultKeyword = caseOrDefaultKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
