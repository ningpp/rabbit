package me.ningpp.rabbit.model;

import java.util.List;

public class TypeParameterConstraintInfo extends CommentElement {

    private ClassOrStructConstraintInfo classOrStructConstraintInfo;

    public ClassOrStructConstraintInfo getClassOrStructConstraintInfo() {
        return classOrStructConstraintInfo;
    }

    public void setClassOrStructConstraintInfo(ClassOrStructConstraintInfo classOrStructConstraintInfo) {
        this.classOrStructConstraintInfo = classOrStructConstraintInfo;
    }

    private ConstructorConstraintInfo constructorConstraintInfo;

    public ConstructorConstraintInfo getConstructorConstraintInfo() {
        return constructorConstraintInfo;
    }

    public void setConstructorConstraintInfo(ConstructorConstraintInfo constructorConstraintInfo) {
        this.constructorConstraintInfo = constructorConstraintInfo;
    }

    private TypeConstraintInfo typeConstraintInfo;

    public TypeConstraintInfo getTypeConstraintInfo() {
        return typeConstraintInfo;
    }

    public void setTypeConstraintInfo(TypeConstraintInfo typeConstraintInfo) {
        this.typeConstraintInfo = typeConstraintInfo;
    }

    private DefaultConstraintInfo defaultConstraintInfo;

    public DefaultConstraintInfo getDefaultConstraintInfo() {
        return defaultConstraintInfo;
    }

    public void setDefaultConstraintInfo(DefaultConstraintInfo defaultConstraintInfo) {
        this.defaultConstraintInfo = defaultConstraintInfo;
    }
}
