package me.ningpp.rabbit.model;

import java.util.List;

public class StructDeclarationInfo {

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
