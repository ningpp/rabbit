package me.ningpp.rabbit.model;

import java.util.List;

public class SwitchExpressionInfo {

    private ExpressionInfo governingExpression;

    public ExpressionInfo getGoverningExpression() {
        return governingExpression;
    }

    public void setGoverningExpression(ExpressionInfo governingExpression) {
        this.governingExpression = governingExpression;
    }

    private String switchKeyword;

    public String getSwitchKeyword() {
        return switchKeyword;
    }

    public void setSwitchKeyword(String switchKeyword) {
        this.switchKeyword = switchKeyword;
    }

    private List<SwitchExpressionArmInfo> arms;

    public List<SwitchExpressionArmInfo> getArms() {
        return arms;
    }

    public void setArms(List<SwitchExpressionArmInfo> arms) {
        this.arms = arms;
    }
}
