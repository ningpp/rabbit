package me.ningpp.rabbit.model;

import java.util.List;

public class AccessorListInfo extends CommentElement {

    private List<AccessorDeclarationInfo> accessors;

    public List<AccessorDeclarationInfo> getAccessors() {
        return accessors;
    }

    public void setAccessors(List<AccessorDeclarationInfo> accessors) {
        this.accessors = accessors;
    }
}
