package me.ningpp.rabbit.model;

import java.util.List;

public class RecordDeclarationInfo {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private String classOrStructKeyword;

    public String getClassOrStructKeyword() {
        return classOrStructKeyword;
    }

    public void setClassOrStructKeyword(String classOrStructKeyword) {
        this.classOrStructKeyword = classOrStructKeyword;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private TypeParameterListInfo typeParameterList;

    public TypeParameterListInfo getTypeParameterList() {
        return typeParameterList;
    }

    public void setTypeParameterList(TypeParameterListInfo typeParameterList) {
        this.typeParameterList = typeParameterList;
    }

    private ParameterListInfo parameterList;

    public ParameterListInfo getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterListInfo parameterList) {
        this.parameterList = parameterList;
    }

    private BaseListInfo baseList;

    public BaseListInfo getBaseList() {
        return baseList;
    }

    public void setBaseList(BaseListInfo baseList) {
        this.baseList = baseList;
    }

    private List<TypeParameterConstraintClauseInfo> constraintClauses;

    public List<TypeParameterConstraintClauseInfo> getConstraintClauses() {
        return constraintClauses;
    }

    public void setConstraintClauses(List<TypeParameterConstraintClauseInfo> constraintClauses) {
        this.constraintClauses = constraintClauses;
    }

    private List<MemberDeclarationInfo> members;

    public List<MemberDeclarationInfo> getMembers() {
        return members;
    }

    public void setMembers(List<MemberDeclarationInfo> members) {
        this.members = members;
    }
}
