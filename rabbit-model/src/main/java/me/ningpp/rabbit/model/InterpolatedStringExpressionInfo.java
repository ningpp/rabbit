package me.ningpp.rabbit.model;

import java.util.List;

public class InterpolatedStringExpressionInfo extends CommentElement {

    private String stringStartToken;

    public String getStringStartToken() {
        return stringStartToken;
    }

    public void setStringStartToken(String stringStartToken) {
        this.stringStartToken = stringStartToken;
    }

    private List<InterpolatedStringContentInfo> contents;

    public List<InterpolatedStringContentInfo> getContents() {
        return contents;
    }

    public void setContents(List<InterpolatedStringContentInfo> contents) {
        this.contents = contents;
    }

    private String stringEndToken;

    public String getStringEndToken() {
        return stringEndToken;
    }

    public void setStringEndToken(String stringEndToken) {
        this.stringEndToken = stringEndToken;
    }
}
