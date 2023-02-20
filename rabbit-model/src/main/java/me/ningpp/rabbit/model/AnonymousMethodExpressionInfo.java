package me.ningpp.rabbit.model;

import java.util.List;

public class AnonymousMethodExpressionInfo {

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

    private String delegateKeyword;

    public String getDelegateKeyword() {
        return delegateKeyword;
    }

    public void setDelegateKeyword(String delegateKeyword) {
        this.delegateKeyword = delegateKeyword;
    }

    private ParameterListInfo parameterList;

    public ParameterListInfo getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterListInfo parameterList) {
        this.parameterList = parameterList;
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
