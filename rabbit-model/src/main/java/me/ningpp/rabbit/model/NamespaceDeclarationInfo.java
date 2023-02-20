package me.ningpp.rabbit.model;

import java.util.List;

public class NamespaceDeclarationInfo {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String namespaceKeyword;

    public String getNamespaceKeyword() {
        return namespaceKeyword;
    }

    public void setNamespaceKeyword(String namespaceKeyword) {
        this.namespaceKeyword = namespaceKeyword;
    }

    private NameInfo name;

    public NameInfo getName() {
        return name;
    }

    public void setName(NameInfo name) {
        this.name = name;
    }

    private List<ExternAliasDirectiveInfo> externs;

    public List<ExternAliasDirectiveInfo> getExterns() {
        return externs;
    }

    public void setExterns(List<ExternAliasDirectiveInfo> externs) {
        this.externs = externs;
    }

    private List<UsingDirectiveInfo> usings;

    public List<UsingDirectiveInfo> getUsings() {
        return usings;
    }

    public void setUsings(List<UsingDirectiveInfo> usings) {
        this.usings = usings;
    }

    private List<MemberDeclarationInfo> members;

    public List<MemberDeclarationInfo> getMembers() {
        return members;
    }

    public void setMembers(List<MemberDeclarationInfo> members) {
        this.members = members;
    }
}
