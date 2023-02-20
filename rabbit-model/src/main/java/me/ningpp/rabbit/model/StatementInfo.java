package me.ningpp.rabbit.model;

import java.util.List;

public class StatementInfo {

    private BlockInfo blockInfo;

    public BlockInfo getBlockInfo() {
        return blockInfo;
    }

    public void setBlockInfo(BlockInfo blockInfo) {
        this.blockInfo = blockInfo;
    }

    private BreakStatementInfo breakStatementInfo;

    public BreakStatementInfo getBreakStatementInfo() {
        return breakStatementInfo;
    }

    public void setBreakStatementInfo(BreakStatementInfo breakStatementInfo) {
        this.breakStatementInfo = breakStatementInfo;
    }

    private CheckedStatementInfo checkedStatementInfo;

    public CheckedStatementInfo getCheckedStatementInfo() {
        return checkedStatementInfo;
    }

    public void setCheckedStatementInfo(CheckedStatementInfo checkedStatementInfo) {
        this.checkedStatementInfo = checkedStatementInfo;
    }

    private ContinueStatementInfo continueStatementInfo;

    public ContinueStatementInfo getContinueStatementInfo() {
        return continueStatementInfo;
    }

    public void setContinueStatementInfo(ContinueStatementInfo continueStatementInfo) {
        this.continueStatementInfo = continueStatementInfo;
    }

    private LocalDeclarationStatementInfo localDeclarationStatementInfo;

    public LocalDeclarationStatementInfo getLocalDeclarationStatementInfo() {
        return localDeclarationStatementInfo;
    }

    public void setLocalDeclarationStatementInfo(LocalDeclarationStatementInfo localDeclarationStatementInfo) {
        this.localDeclarationStatementInfo = localDeclarationStatementInfo;
    }

    private DoStatementInfo doStatementInfo;

    public DoStatementInfo getDoStatementInfo() {
        return doStatementInfo;
    }

    public void setDoStatementInfo(DoStatementInfo doStatementInfo) {
        this.doStatementInfo = doStatementInfo;
    }

    private EmptyStatementInfo emptyStatementInfo;

    public EmptyStatementInfo getEmptyStatementInfo() {
        return emptyStatementInfo;
    }

    public void setEmptyStatementInfo(EmptyStatementInfo emptyStatementInfo) {
        this.emptyStatementInfo = emptyStatementInfo;
    }

    private ExpressionStatementInfo expressionStatementInfo;

    public ExpressionStatementInfo getExpressionStatementInfo() {
        return expressionStatementInfo;
    }

    public void setExpressionStatementInfo(ExpressionStatementInfo expressionStatementInfo) {
        this.expressionStatementInfo = expressionStatementInfo;
    }

    private FixedStatementInfo fixedStatementInfo;

    public FixedStatementInfo getFixedStatementInfo() {
        return fixedStatementInfo;
    }

    public void setFixedStatementInfo(FixedStatementInfo fixedStatementInfo) {
        this.fixedStatementInfo = fixedStatementInfo;
    }

    private ForStatementInfo forStatementInfo;

    public ForStatementInfo getForStatementInfo() {
        return forStatementInfo;
    }

    public void setForStatementInfo(ForStatementInfo forStatementInfo) {
        this.forStatementInfo = forStatementInfo;
    }

    private GotoStatementInfo gotoStatementInfo;

    public GotoStatementInfo getGotoStatementInfo() {
        return gotoStatementInfo;
    }

    public void setGotoStatementInfo(GotoStatementInfo gotoStatementInfo) {
        this.gotoStatementInfo = gotoStatementInfo;
    }

    private IfStatementInfo ifStatementInfo;

    public IfStatementInfo getIfStatementInfo() {
        return ifStatementInfo;
    }

    public void setIfStatementInfo(IfStatementInfo ifStatementInfo) {
        this.ifStatementInfo = ifStatementInfo;
    }

    private LabeledStatementInfo labeledStatementInfo;

    public LabeledStatementInfo getLabeledStatementInfo() {
        return labeledStatementInfo;
    }

    public void setLabeledStatementInfo(LabeledStatementInfo labeledStatementInfo) {
        this.labeledStatementInfo = labeledStatementInfo;
    }

    private LocalFunctionStatementInfo localFunctionStatementInfo;

    public LocalFunctionStatementInfo getLocalFunctionStatementInfo() {
        return localFunctionStatementInfo;
    }

    public void setLocalFunctionStatementInfo(LocalFunctionStatementInfo localFunctionStatementInfo) {
        this.localFunctionStatementInfo = localFunctionStatementInfo;
    }

    private LockStatementInfo lockStatementInfo;

    public LockStatementInfo getLockStatementInfo() {
        return lockStatementInfo;
    }

    public void setLockStatementInfo(LockStatementInfo lockStatementInfo) {
        this.lockStatementInfo = lockStatementInfo;
    }

    private ReturnStatementInfo returnStatementInfo;

    public ReturnStatementInfo getReturnStatementInfo() {
        return returnStatementInfo;
    }

    public void setReturnStatementInfo(ReturnStatementInfo returnStatementInfo) {
        this.returnStatementInfo = returnStatementInfo;
    }

    private SwitchStatementInfo switchStatementInfo;

    public SwitchStatementInfo getSwitchStatementInfo() {
        return switchStatementInfo;
    }

    public void setSwitchStatementInfo(SwitchStatementInfo switchStatementInfo) {
        this.switchStatementInfo = switchStatementInfo;
    }

    private ThrowStatementInfo throwStatementInfo;

    public ThrowStatementInfo getThrowStatementInfo() {
        return throwStatementInfo;
    }

    public void setThrowStatementInfo(ThrowStatementInfo throwStatementInfo) {
        this.throwStatementInfo = throwStatementInfo;
    }

    private TryStatementInfo tryStatementInfo;

    public TryStatementInfo getTryStatementInfo() {
        return tryStatementInfo;
    }

    public void setTryStatementInfo(TryStatementInfo tryStatementInfo) {
        this.tryStatementInfo = tryStatementInfo;
    }

    private UnsafeStatementInfo unsafeStatementInfo;

    public UnsafeStatementInfo getUnsafeStatementInfo() {
        return unsafeStatementInfo;
    }

    public void setUnsafeStatementInfo(UnsafeStatementInfo unsafeStatementInfo) {
        this.unsafeStatementInfo = unsafeStatementInfo;
    }

    private UsingStatementInfo usingStatementInfo;

    public UsingStatementInfo getUsingStatementInfo() {
        return usingStatementInfo;
    }

    public void setUsingStatementInfo(UsingStatementInfo usingStatementInfo) {
        this.usingStatementInfo = usingStatementInfo;
    }

    private WhileStatementInfo whileStatementInfo;

    public WhileStatementInfo getWhileStatementInfo() {
        return whileStatementInfo;
    }

    public void setWhileStatementInfo(WhileStatementInfo whileStatementInfo) {
        this.whileStatementInfo = whileStatementInfo;
    }

    private YieldStatementInfo yieldStatementInfo;

    public YieldStatementInfo getYieldStatementInfo() {
        return yieldStatementInfo;
    }

    public void setYieldStatementInfo(YieldStatementInfo yieldStatementInfo) {
        this.yieldStatementInfo = yieldStatementInfo;
    }

    private ForEachStatementInfo forEachStatementInfo;

    public ForEachStatementInfo getForEachStatementInfo() {
        return forEachStatementInfo;
    }

    public void setForEachStatementInfo(ForEachStatementInfo forEachStatementInfo) {
        this.forEachStatementInfo = forEachStatementInfo;
    }

    private ForEachVariableStatementInfo forEachVariableStatementInfo;

    public ForEachVariableStatementInfo getForEachVariableStatementInfo() {
        return forEachVariableStatementInfo;
    }

    public void setForEachVariableStatementInfo(ForEachVariableStatementInfo forEachVariableStatementInfo) {
        this.forEachVariableStatementInfo = forEachVariableStatementInfo;
    }
}
