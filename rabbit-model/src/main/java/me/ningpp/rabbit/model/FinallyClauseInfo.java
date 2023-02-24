package me.ningpp.rabbit.model;

import java.util.List;

public class FinallyClauseInfo extends CommentElement {

    private String finallyKeyword;

    public String getFinallyKeyword() {
        return finallyKeyword;
    }

    public void setFinallyKeyword(String finallyKeyword) {
        this.finallyKeyword = finallyKeyword;
    }

    private BlockInfo block;

    public BlockInfo getBlock() {
        return block;
    }

    public void setBlock(BlockInfo block) {
        this.block = block;
    }
}
