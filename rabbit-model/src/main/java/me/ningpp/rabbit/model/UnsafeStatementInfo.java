package me.ningpp.rabbit.model;

import java.util.List;

public class UnsafeStatementInfo extends SourceLocation {

    private String unsafeKeyword;

    public String getUnsafeKeyword() {
        return unsafeKeyword;
    }

    public void setUnsafeKeyword(String unsafeKeyword) {
        this.unsafeKeyword = unsafeKeyword;
    }

    private BlockInfo block;

    public BlockInfo getBlock() {
        return block;
    }

    public void setBlock(BlockInfo block) {
        this.block = block;
    }
}
