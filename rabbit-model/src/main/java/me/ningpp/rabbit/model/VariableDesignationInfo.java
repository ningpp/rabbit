package me.ningpp.rabbit.model;

import java.util.List;

public class VariableDesignationInfo {

    private SingleVariableDesignationInfo singleVariableDesignationInfo;

    public SingleVariableDesignationInfo getSingleVariableDesignationInfo() {
        return singleVariableDesignationInfo;
    }

    public void setSingleVariableDesignationInfo(SingleVariableDesignationInfo singleVariableDesignationInfo) {
        this.singleVariableDesignationInfo = singleVariableDesignationInfo;
    }

    private DiscardDesignationInfo discardDesignationInfo;

    public DiscardDesignationInfo getDiscardDesignationInfo() {
        return discardDesignationInfo;
    }

    public void setDiscardDesignationInfo(DiscardDesignationInfo discardDesignationInfo) {
        this.discardDesignationInfo = discardDesignationInfo;
    }

    private ParenthesizedVariableDesignationInfo parenthesizedVariableDesignationInfo;

    public ParenthesizedVariableDesignationInfo getParenthesizedVariableDesignationInfo() {
        return parenthesizedVariableDesignationInfo;
    }

    public void setParenthesizedVariableDesignationInfo(ParenthesizedVariableDesignationInfo parenthesizedVariableDesignationInfo) {
        this.parenthesizedVariableDesignationInfo = parenthesizedVariableDesignationInfo;
    }
}
