package me.ningpp.rabbit.model;

import java.util.List;

public class ArrayRankSpecifierInfo extends CommentElement {

    private int rank;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private List<ExpressionInfo> sizes;

    public List<ExpressionInfo> getSizes() {
        return sizes;
    }

    public void setSizes(List<ExpressionInfo> sizes) {
        this.sizes = sizes;
    }

    private String closeBracketToken;

    public String getCloseBracketToken() {
        return closeBracketToken;
    }

    public void setCloseBracketToken(String closeBracketToken) {
        this.closeBracketToken = closeBracketToken;
    }
}
