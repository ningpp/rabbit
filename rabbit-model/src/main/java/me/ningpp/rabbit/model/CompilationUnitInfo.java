package me.ningpp.rabbit.model;

import java.util.List;

public class CompilationUnitInfo {

    private List<AttributeListInfo> attributeLists;

    public List<AttributeListInfo> getAttributeLists() {
        return attributeLists;
    }

    public void setAttributeLists(List<AttributeListInfo> attributeLists) {
        this.attributeLists = attributeLists;
    }

    private List<UsingDirectiveInfo> usings;

    public List<UsingDirectiveInfo> getUsings() {
        return usings;
    }

    public void setUsings(List<UsingDirectiveInfo> usings) {
        this.usings = usings;
    }

    private List<ExternAliasDirectiveInfo> externs;

    public List<ExternAliasDirectiveInfo> getExterns() {
        return externs;
    }

    public void setExterns(List<ExternAliasDirectiveInfo> externs) {
        this.externs = externs;
    }

    private List<MemberDeclarationInfo> members;

    public List<MemberDeclarationInfo> getMembers() {
        return members;
    }

    public void setMembers(List<MemberDeclarationInfo> members) {
        this.members = members;
    }
}
