package me.ningpp.rabbit.model;

import java.util.List;

public class FunctionPointerTypeInfo extends CommentElement {

    private String delegateKeyword;

    public String getDelegateKeyword() {
        return delegateKeyword;
    }

    public void setDelegateKeyword(String delegateKeyword) {
        this.delegateKeyword = delegateKeyword;
    }

    private String asteriskToken;

    public String getAsteriskToken() {
        return asteriskToken;
    }

    public void setAsteriskToken(String asteriskToken) {
        this.asteriskToken = asteriskToken;
    }

    private FunctionPointerCallingConventionInfo callingConvention;

    public FunctionPointerCallingConventionInfo getCallingConvention() {
        return callingConvention;
    }

    public void setCallingConvention(FunctionPointerCallingConventionInfo callingConvention) {
        this.callingConvention = callingConvention;
    }

    private FunctionPointerParameterListInfo parameterList;

    public FunctionPointerParameterListInfo getParameterList() {
        return parameterList;
    }

    public void setParameterList(FunctionPointerParameterListInfo parameterList) {
        this.parameterList = parameterList;
    }

    private boolean isVar;

    public boolean getIsVar() {
        return isVar;
    }

    public void setIsVar(boolean isVar) {
        this.isVar = isVar;
    }

    private boolean isUnmanaged;

    public boolean getIsUnmanaged() {
        return isUnmanaged;
    }

    public void setIsUnmanaged(boolean isUnmanaged) {
        this.isUnmanaged = isUnmanaged;
    }

    private boolean isNotNull;

    public boolean getIsNotNull() {
        return isNotNull;
    }

    public void setIsNotNull(boolean isNotNull) {
        this.isNotNull = isNotNull;
    }

    private boolean isNint;

    public boolean getIsNint() {
        return isNint;
    }

    public void setIsNint(boolean isNint) {
        this.isNint = isNint;
    }

    private boolean isNuint;

    public boolean getIsNuint() {
        return isNuint;
    }

    public void setIsNuint(boolean isNuint) {
        this.isNuint = isNuint;
    }
}
