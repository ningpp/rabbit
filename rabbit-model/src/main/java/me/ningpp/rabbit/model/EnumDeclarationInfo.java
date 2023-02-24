package me.ningpp.rabbit.model;

import java.util.List;

public class EnumDeclarationInfo extends CommentElement {

    private List<String> modifiers;

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    private String enumKeyword;

    public String getEnumKeyword() {
        return enumKeyword;
    }

    public void setEnumKeyword(String enumKeyword) {
        this.enumKeyword = enumKeyword;
    }

    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    private BaseListInfo baseList;

    public BaseListInfo getBaseList() {
        return baseList;
    }

    public void setBaseList(BaseListInfo baseList) {
        this.baseList = baseList;
    }

    private List<EnumMemberDeclarationInfo> members;

    public List<EnumMemberDeclarationInfo> getMembers() {
        return members;
    }

    public void setMembers(List<EnumMemberDeclarationInfo> members) {
        this.members = members;
    }
}
