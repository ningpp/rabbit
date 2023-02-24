package me.ningpp.rabbit.model;

import java.util.List;

public class FunctionPointerUnmanagedCallingConventionListInfo extends CommentElement {

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private List<FunctionPointerUnmanagedCallingConventionInfo> callingConventions;

    public List<FunctionPointerUnmanagedCallingConventionInfo> getCallingConventions() {
        return callingConventions;
    }

    public void setCallingConventions(List<FunctionPointerUnmanagedCallingConventionInfo> callingConventions) {
        this.callingConventions = callingConventions;
    }

    private String closeBracketToken;

    public String getCloseBracketToken() {
        return closeBracketToken;
    }

    public void setCloseBracketToken(String closeBracketToken) {
        this.closeBracketToken = closeBracketToken;
    }
}
