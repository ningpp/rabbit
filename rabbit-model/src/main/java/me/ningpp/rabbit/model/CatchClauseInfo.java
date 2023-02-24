package me.ningpp.rabbit.model;

import java.util.List;

public class CatchClauseInfo extends CommentElement {

    private String catchKeyword;

    public String getCatchKeyword() {
        return catchKeyword;
    }

    public void setCatchKeyword(String catchKeyword) {
        this.catchKeyword = catchKeyword;
    }

    private CatchDeclarationInfo declaration;

    public CatchDeclarationInfo getDeclaration() {
        return declaration;
    }

    public void setDeclaration(CatchDeclarationInfo declaration) {
        this.declaration = declaration;
    }

    private CatchFilterClauseInfo filter;

    public CatchFilterClauseInfo getFilter() {
        return filter;
    }

    public void setFilter(CatchFilterClauseInfo filter) {
        this.filter = filter;
    }

    private BlockInfo block;

    public BlockInfo getBlock() {
        return block;
    }

    public void setBlock(BlockInfo block) {
        this.block = block;
    }
}
