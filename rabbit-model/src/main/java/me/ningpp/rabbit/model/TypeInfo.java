package me.ningpp.rabbit.model;

import java.util.List;

public class TypeInfo {

    private AliasQualifiedNameInfo aliasQualifiedNameInfo;

    public AliasQualifiedNameInfo getAliasQualifiedNameInfo() {
        return aliasQualifiedNameInfo;
    }

    public void setAliasQualifiedNameInfo(AliasQualifiedNameInfo aliasQualifiedNameInfo) {
        this.aliasQualifiedNameInfo = aliasQualifiedNameInfo;
    }

    private QualifiedNameInfo qualifiedNameInfo;

    public QualifiedNameInfo getQualifiedNameInfo() {
        return qualifiedNameInfo;
    }

    public void setQualifiedNameInfo(QualifiedNameInfo qualifiedNameInfo) {
        this.qualifiedNameInfo = qualifiedNameInfo;
    }

    private GenericNameInfo genericNameInfo;

    public GenericNameInfo getGenericNameInfo() {
        return genericNameInfo;
    }

    public void setGenericNameInfo(GenericNameInfo genericNameInfo) {
        this.genericNameInfo = genericNameInfo;
    }

    private IdentifierNameInfo identifierNameInfo;

    public IdentifierNameInfo getIdentifierNameInfo() {
        return identifierNameInfo;
    }

    public void setIdentifierNameInfo(IdentifierNameInfo identifierNameInfo) {
        this.identifierNameInfo = identifierNameInfo;
    }

    private RefTypeInfo refTypeInfo;

    public RefTypeInfo getRefTypeInfo() {
        return refTypeInfo;
    }

    public void setRefTypeInfo(RefTypeInfo refTypeInfo) {
        this.refTypeInfo = refTypeInfo;
    }

    private PredefinedTypeInfo predefinedTypeInfo;

    public PredefinedTypeInfo getPredefinedTypeInfo() {
        return predefinedTypeInfo;
    }

    public void setPredefinedTypeInfo(PredefinedTypeInfo predefinedTypeInfo) {
        this.predefinedTypeInfo = predefinedTypeInfo;
    }

    private ArrayTypeInfo arrayTypeInfo;

    public ArrayTypeInfo getArrayTypeInfo() {
        return arrayTypeInfo;
    }

    public void setArrayTypeInfo(ArrayTypeInfo arrayTypeInfo) {
        this.arrayTypeInfo = arrayTypeInfo;
    }

    private PointerTypeInfo pointerTypeInfo;

    public PointerTypeInfo getPointerTypeInfo() {
        return pointerTypeInfo;
    }

    public void setPointerTypeInfo(PointerTypeInfo pointerTypeInfo) {
        this.pointerTypeInfo = pointerTypeInfo;
    }

    private FunctionPointerTypeInfo functionPointerTypeInfo;

    public FunctionPointerTypeInfo getFunctionPointerTypeInfo() {
        return functionPointerTypeInfo;
    }

    public void setFunctionPointerTypeInfo(FunctionPointerTypeInfo functionPointerTypeInfo) {
        this.functionPointerTypeInfo = functionPointerTypeInfo;
    }

    private NullableTypeInfo nullableTypeInfo;

    public NullableTypeInfo getNullableTypeInfo() {
        return nullableTypeInfo;
    }

    public void setNullableTypeInfo(NullableTypeInfo nullableTypeInfo) {
        this.nullableTypeInfo = nullableTypeInfo;
    }

    private TupleTypeInfo tupleTypeInfo;

    public TupleTypeInfo getTupleTypeInfo() {
        return tupleTypeInfo;
    }

    public void setTupleTypeInfo(TupleTypeInfo tupleTypeInfo) {
        this.tupleTypeInfo = tupleTypeInfo;
    }

    private OmittedTypeArgumentInfo omittedTypeArgumentInfo;

    public OmittedTypeArgumentInfo getOmittedTypeArgumentInfo() {
        return omittedTypeArgumentInfo;
    }

    public void setOmittedTypeArgumentInfo(OmittedTypeArgumentInfo omittedTypeArgumentInfo) {
        this.omittedTypeArgumentInfo = omittedTypeArgumentInfo;
    }

    private ScopedTypeInfo scopedTypeInfo;

    public ScopedTypeInfo getScopedTypeInfo() {
        return scopedTypeInfo;
    }

    public void setScopedTypeInfo(ScopedTypeInfo scopedTypeInfo) {
        this.scopedTypeInfo = scopedTypeInfo;
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
