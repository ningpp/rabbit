package me.ningpp.rabbit.model;

import java.util.List;

public class InterpolationAlignmentClauseInfo {

    private String commaToken;

    public String getCommaToken() {
        return commaToken;
    }

    public void setCommaToken(String commaToken) {
        this.commaToken = commaToken;
    }

    private ExpressionInfo value;

    public ExpressionInfo getValue() {
        return value;
    }

    public void setValue(ExpressionInfo value) {
        this.value = value;
    }
}
