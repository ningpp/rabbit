package me.ningpp.rabbit.model;

import java.util.List;

public class PatternInfo {

    private DiscardPatternInfo discardPatternInfo;

    public DiscardPatternInfo getDiscardPatternInfo() {
        return discardPatternInfo;
    }

    public void setDiscardPatternInfo(DiscardPatternInfo discardPatternInfo) {
        this.discardPatternInfo = discardPatternInfo;
    }

    private DeclarationPatternInfo declarationPatternInfo;

    public DeclarationPatternInfo getDeclarationPatternInfo() {
        return declarationPatternInfo;
    }

    public void setDeclarationPatternInfo(DeclarationPatternInfo declarationPatternInfo) {
        this.declarationPatternInfo = declarationPatternInfo;
    }

    private VarPatternInfo varPatternInfo;

    public VarPatternInfo getVarPatternInfo() {
        return varPatternInfo;
    }

    public void setVarPatternInfo(VarPatternInfo varPatternInfo) {
        this.varPatternInfo = varPatternInfo;
    }

    private RecursivePatternInfo recursivePatternInfo;

    public RecursivePatternInfo getRecursivePatternInfo() {
        return recursivePatternInfo;
    }

    public void setRecursivePatternInfo(RecursivePatternInfo recursivePatternInfo) {
        this.recursivePatternInfo = recursivePatternInfo;
    }

    private ConstantPatternInfo constantPatternInfo;

    public ConstantPatternInfo getConstantPatternInfo() {
        return constantPatternInfo;
    }

    public void setConstantPatternInfo(ConstantPatternInfo constantPatternInfo) {
        this.constantPatternInfo = constantPatternInfo;
    }

    private ParenthesizedPatternInfo parenthesizedPatternInfo;

    public ParenthesizedPatternInfo getParenthesizedPatternInfo() {
        return parenthesizedPatternInfo;
    }

    public void setParenthesizedPatternInfo(ParenthesizedPatternInfo parenthesizedPatternInfo) {
        this.parenthesizedPatternInfo = parenthesizedPatternInfo;
    }

    private RelationalPatternInfo relationalPatternInfo;

    public RelationalPatternInfo getRelationalPatternInfo() {
        return relationalPatternInfo;
    }

    public void setRelationalPatternInfo(RelationalPatternInfo relationalPatternInfo) {
        this.relationalPatternInfo = relationalPatternInfo;
    }

    private TypePatternInfo typePatternInfo;

    public TypePatternInfo getTypePatternInfo() {
        return typePatternInfo;
    }

    public void setTypePatternInfo(TypePatternInfo typePatternInfo) {
        this.typePatternInfo = typePatternInfo;
    }

    private BinaryPatternInfo binaryPatternInfo;

    public BinaryPatternInfo getBinaryPatternInfo() {
        return binaryPatternInfo;
    }

    public void setBinaryPatternInfo(BinaryPatternInfo binaryPatternInfo) {
        this.binaryPatternInfo = binaryPatternInfo;
    }

    private UnaryPatternInfo unaryPatternInfo;

    public UnaryPatternInfo getUnaryPatternInfo() {
        return unaryPatternInfo;
    }

    public void setUnaryPatternInfo(UnaryPatternInfo unaryPatternInfo) {
        this.unaryPatternInfo = unaryPatternInfo;
    }

    private ListPatternInfo listPatternInfo;

    public ListPatternInfo getListPatternInfo() {
        return listPatternInfo;
    }

    public void setListPatternInfo(ListPatternInfo listPatternInfo) {
        this.listPatternInfo = listPatternInfo;
    }

    private SlicePatternInfo slicePatternInfo;

    public SlicePatternInfo getSlicePatternInfo() {
        return slicePatternInfo;
    }

    public void setSlicePatternInfo(SlicePatternInfo slicePatternInfo) {
        this.slicePatternInfo = slicePatternInfo;
    }
}
