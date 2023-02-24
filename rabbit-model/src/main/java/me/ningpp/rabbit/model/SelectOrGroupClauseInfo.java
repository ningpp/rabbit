package me.ningpp.rabbit.model;

import java.util.List;

public class SelectOrGroupClauseInfo extends CommentElement {

    private SelectClauseInfo selectClauseInfo;

    public SelectClauseInfo getSelectClauseInfo() {
        return selectClauseInfo;
    }

    public void setSelectClauseInfo(SelectClauseInfo selectClauseInfo) {
        this.selectClauseInfo = selectClauseInfo;
    }

    private GroupClauseInfo groupClauseInfo;

    public GroupClauseInfo getGroupClauseInfo() {
        return groupClauseInfo;
    }

    public void setGroupClauseInfo(GroupClauseInfo groupClauseInfo) {
        this.groupClauseInfo = groupClauseInfo;
    }
}
