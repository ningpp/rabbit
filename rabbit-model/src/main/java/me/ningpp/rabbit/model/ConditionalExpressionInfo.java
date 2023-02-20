package me.ningpp.rabbit.model;

import java.util.List;

public class ConditionalExpressionInfo {

    private ExpressionInfo condition;

    public ExpressionInfo getCondition() {
        return condition;
    }

    public void setCondition(ExpressionInfo condition) {
        this.condition = condition;
    }

    private String questionToken;

    public String getQuestionToken() {
        return questionToken;
    }

    public void setQuestionToken(String questionToken) {
        this.questionToken = questionToken;
    }

    private ExpressionInfo whenTrue;

    public ExpressionInfo getWhenTrue() {
        return whenTrue;
    }

    public void setWhenTrue(ExpressionInfo whenTrue) {
        this.whenTrue = whenTrue;
    }

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }

    private ExpressionInfo whenFalse;

    public ExpressionInfo getWhenFalse() {
        return whenFalse;
    }

    public void setWhenFalse(ExpressionInfo whenFalse) {
        this.whenFalse = whenFalse;
    }
}
