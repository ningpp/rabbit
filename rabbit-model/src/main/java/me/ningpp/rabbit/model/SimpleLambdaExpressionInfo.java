package me.ningpp.rabbit.model;

import java.util.List;

public class SimpleLambdaExpressionInfo {

    private String asyncKeyword;

    public String getAsyncKeyword() {
        return asyncKeyword;
    }

    public void setAsyncKeyword(String asyncKeyword) {
        this.asyncKeyword = asyncKeyword;
    }

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private ParameterInfo parameter;

    public ParameterInfo getParameter() {
        return parameter;
    }

    public void setParameter(ParameterInfo parameter) {
        this.parameter = parameter;
    }

    private String arrowToken;

    public String getArrowToken() {
        return arrowToken;
    }

    public void setArrowToken(String arrowToken) {
        this.arrowToken = arrowToken;
    }

    private BlockInfo block;

    public BlockInfo getBlock() {
        return block;
    }

    public void setBlock(BlockInfo block) {
        this.block = block;
    }

    private ExpressionInfo expressionBody;

    public ExpressionInfo getExpressionBody() {
        return expressionBody;
    }

    public void setExpressionBody(ExpressionInfo expressionBody) {
        this.expressionBody = expressionBody;
    }

    private CSharpInfoNode body;

    public CSharpInfoNode getBody() {
        return body;
    }

    public void setBody(CSharpInfoNode body) {
        this.body = body;
    }
}
