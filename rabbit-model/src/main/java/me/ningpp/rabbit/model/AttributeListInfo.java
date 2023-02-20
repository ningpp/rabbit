package me.ningpp.rabbit.model;

import java.util.List;

public class AttributeListInfo {

    private String openBracketToken;

    public String getOpenBracketToken() {
        return openBracketToken;
    }

    public void setOpenBracketToken(String openBracketToken) {
        this.openBracketToken = openBracketToken;
    }

    private AttributeTargetSpecifierInfo target;

    public AttributeTargetSpecifierInfo getTarget() {
        return target;
    }

    public void setTarget(AttributeTargetSpecifierInfo target) {
        this.target = target;
    }

    private List<AttributeInfo> attributes;

    public List<AttributeInfo> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeInfo> attributes) {
        this.attributes = attributes;
    }

    private String closeBracketToken;

    public String getCloseBracketToken() {
        return closeBracketToken;
    }

    public void setCloseBracketToken(String closeBracketToken) {
        this.closeBracketToken = closeBracketToken;
    }
}
