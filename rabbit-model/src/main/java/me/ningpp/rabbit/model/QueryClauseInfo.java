package me.ningpp.rabbit.model;

import java.util.List;

public class QueryClauseInfo {

    private FromClauseInfo fromClauseInfo;

    public FromClauseInfo getFromClauseInfo() {
        return fromClauseInfo;
    }

    public void setFromClauseInfo(FromClauseInfo fromClauseInfo) {
        this.fromClauseInfo = fromClauseInfo;
    }

    private LetClauseInfo letClauseInfo;

    public LetClauseInfo getLetClauseInfo() {
        return letClauseInfo;
    }

    public void setLetClauseInfo(LetClauseInfo letClauseInfo) {
        this.letClauseInfo = letClauseInfo;
    }

    private JoinClauseInfo joinClauseInfo;

    public JoinClauseInfo getJoinClauseInfo() {
        return joinClauseInfo;
    }

    public void setJoinClauseInfo(JoinClauseInfo joinClauseInfo) {
        this.joinClauseInfo = joinClauseInfo;
    }

    private WhereClauseInfo whereClauseInfo;

    public WhereClauseInfo getWhereClauseInfo() {
        return whereClauseInfo;
    }

    public void setWhereClauseInfo(WhereClauseInfo whereClauseInfo) {
        this.whereClauseInfo = whereClauseInfo;
    }

    private OrderByClauseInfo orderByClauseInfo;

    public OrderByClauseInfo getOrderByClauseInfo() {
        return orderByClauseInfo;
    }

    public void setOrderByClauseInfo(OrderByClauseInfo orderByClauseInfo) {
        this.orderByClauseInfo = orderByClauseInfo;
    }
}
