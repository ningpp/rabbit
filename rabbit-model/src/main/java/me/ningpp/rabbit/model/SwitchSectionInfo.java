package me.ningpp.rabbit.model;

import java.util.List;

public class SwitchSectionInfo {

    private List<SwitchLabelInfo> labels;

    public List<SwitchLabelInfo> getLabels() {
        return labels;
    }

    public void setLabels(List<SwitchLabelInfo> labels) {
        this.labels = labels;
    }

    private List<StatementInfo> statements;

    public List<StatementInfo> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementInfo> statements) {
        this.statements = statements;
    }
}
