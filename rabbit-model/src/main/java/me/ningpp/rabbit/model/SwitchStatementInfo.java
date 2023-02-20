package me.ningpp.rabbit.model;

import java.util.List;

public class SwitchStatementInfo {

    private String switchKeyword;

    public String getSwitchKeyword() {
        return switchKeyword;
    }

    public void setSwitchKeyword(String switchKeyword) {
        this.switchKeyword = switchKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private List<SwitchSectionInfo> sections;

    public List<SwitchSectionInfo> getSections() {
        return sections;
    }

    public void setSections(List<SwitchSectionInfo> sections) {
        this.sections = sections;
    }
}
