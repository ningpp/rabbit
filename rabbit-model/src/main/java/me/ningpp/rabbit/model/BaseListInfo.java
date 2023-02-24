package me.ningpp.rabbit.model;

import java.util.List;

public class BaseListInfo extends CommentElement {

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }

    private List<BaseTypeInfo> types;

    public List<BaseTypeInfo> getTypes() {
        return types;
    }

    public void setTypes(List<BaseTypeInfo> types) {
        this.types = types;
    }
}
