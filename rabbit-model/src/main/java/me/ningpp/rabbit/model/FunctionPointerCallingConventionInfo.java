package me.ningpp.rabbit.model;

import java.util.List;

public class FunctionPointerCallingConventionInfo extends CommentElement {

    private String managedOrUnmanagedKeyword;

    public String getManagedOrUnmanagedKeyword() {
        return managedOrUnmanagedKeyword;
    }

    public void setManagedOrUnmanagedKeyword(String managedOrUnmanagedKeyword) {
        this.managedOrUnmanagedKeyword = managedOrUnmanagedKeyword;
    }

    private FunctionPointerUnmanagedCallingConventionListInfo unmanagedCallingConventionList;

    public FunctionPointerUnmanagedCallingConventionListInfo getUnmanagedCallingConventionList() {
        return unmanagedCallingConventionList;
    }

    public void setUnmanagedCallingConventionList(FunctionPointerUnmanagedCallingConventionListInfo unmanagedCallingConventionList) {
        this.unmanagedCallingConventionList = unmanagedCallingConventionList;
    }
}
