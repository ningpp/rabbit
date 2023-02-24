package me.ningpp.rabbit.model;

import java.util.List;

public class PropertyPatternClauseInfo extends CommentElement {

    private List<SubpatternInfo> subpatterns;

    public List<SubpatternInfo> getSubpatterns() {
        return subpatterns;
    }

    public void setSubpatterns(List<SubpatternInfo> subpatterns) {
        this.subpatterns = subpatterns;
    }
}
