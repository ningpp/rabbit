package me.ningpp.rabbit.model;

import java.util.List;

public class CaseSwitchLabelInfo extends CommentElement {

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private ExpressionInfo value;

    public ExpressionInfo getValue() {
        return value;
    }

    public void setValue(ExpressionInfo value) {
        this.value = value;
    }

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }
}
