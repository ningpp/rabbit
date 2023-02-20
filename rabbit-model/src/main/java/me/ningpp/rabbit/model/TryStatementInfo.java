package me.ningpp.rabbit.model;

import java.util.List;

public class TryStatementInfo {

    private String tryKeyword;

    public String getTryKeyword() {
        return tryKeyword;
    }

    public void setTryKeyword(String tryKeyword) {
        this.tryKeyword = tryKeyword;
    }

    private BlockInfo block;

    public BlockInfo getBlock() {
        return block;
    }

    public void setBlock(BlockInfo block) {
        this.block = block;
    }

    private List<CatchClauseInfo> catches;

    public List<CatchClauseInfo> getCatches() {
        return catches;
    }

    public void setCatches(List<CatchClauseInfo> catches) {
        this.catches = catches;
    }

    private FinallyClauseInfo finallyInfo;

    public FinallyClauseInfo getFinallyInfo() {
        return finallyInfo;
    }

    public void setFinallyInfo(FinallyClauseInfo finallyInfo) {
        this.finallyInfo = finallyInfo;
    }
}
