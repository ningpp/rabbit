package me.ningpp.rabbit.model;

import java.util.List;

public class BlockInfo extends SourceLocation {

    private List<StatementInfo> statements;

    public List<StatementInfo> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementInfo> statements) {
        this.statements = statements;
    }
}
