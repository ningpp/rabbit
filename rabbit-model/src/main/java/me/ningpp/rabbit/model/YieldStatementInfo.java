package me.ningpp.rabbit.model;

import java.util.List;

public class YieldStatementInfo extends SourceLocation {

    private String yieldKeyword;

    public String getYieldKeyword() {
        return yieldKeyword;
    }

    public void setYieldKeyword(String yieldKeyword) {
        this.yieldKeyword = yieldKeyword;
    }

    private String returnOrBreakKeyword;

    public String getReturnOrBreakKeyword() {
        return returnOrBreakKeyword;
    }

    public void setReturnOrBreakKeyword(String returnOrBreakKeyword) {
        this.returnOrBreakKeyword = returnOrBreakKeyword;
    }

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }
}
