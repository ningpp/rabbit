package me.ningpp.rabbit.model;

import java.util.List;

public class SlicePatternInfo {

    private String dotDotToken;

    public String getDotDotToken() {
        return dotDotToken;
    }

    public void setDotDotToken(String dotDotToken) {
        this.dotDotToken = dotDotToken;
    }

    private PatternInfo pattern;

    public PatternInfo getPattern() {
        return pattern;
    }

    public void setPattern(PatternInfo pattern) {
        this.pattern = pattern;
    }
}
