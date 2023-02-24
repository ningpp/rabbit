package me.ningpp.rabbit.model;

import java.util.List;

public class SwitchLabelInfo extends CommentElement {

    private CasePatternSwitchLabelInfo casePatternSwitchLabelInfo;

    public CasePatternSwitchLabelInfo getCasePatternSwitchLabelInfo() {
        return casePatternSwitchLabelInfo;
    }

    public void setCasePatternSwitchLabelInfo(CasePatternSwitchLabelInfo casePatternSwitchLabelInfo) {
        this.casePatternSwitchLabelInfo = casePatternSwitchLabelInfo;
    }

    private CaseSwitchLabelInfo caseSwitchLabelInfo;

    public CaseSwitchLabelInfo getCaseSwitchLabelInfo() {
        return caseSwitchLabelInfo;
    }

    public void setCaseSwitchLabelInfo(CaseSwitchLabelInfo caseSwitchLabelInfo) {
        this.caseSwitchLabelInfo = caseSwitchLabelInfo;
    }

    private DefaultSwitchLabelInfo defaultSwitchLabelInfo;

    public DefaultSwitchLabelInfo getDefaultSwitchLabelInfo() {
        return defaultSwitchLabelInfo;
    }

    public void setDefaultSwitchLabelInfo(DefaultSwitchLabelInfo defaultSwitchLabelInfo) {
        this.defaultSwitchLabelInfo = defaultSwitchLabelInfo;
    }
}
