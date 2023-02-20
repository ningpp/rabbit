package me.ningpp.rabbit.model;

import java.util.List;

public class QueryBodyInfo {

    private List<QueryClauseInfo> clauses;

    public List<QueryClauseInfo> getClauses() {
        return clauses;
    }

    public void setClauses(List<QueryClauseInfo> clauses) {
        this.clauses = clauses;
    }

    private SelectOrGroupClauseInfo selectOrGroup;

    public SelectOrGroupClauseInfo getSelectOrGroup() {
        return selectOrGroup;
    }

    public void setSelectOrGroup(SelectOrGroupClauseInfo selectOrGroup) {
        this.selectOrGroup = selectOrGroup;
    }

    private QueryContinuationInfo continuation;

    public QueryContinuationInfo getContinuation() {
        return continuation;
    }

    public void setContinuation(QueryContinuationInfo continuation) {
        this.continuation = continuation;
    }
}
