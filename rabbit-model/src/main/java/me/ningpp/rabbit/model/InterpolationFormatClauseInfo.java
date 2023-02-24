package me.ningpp.rabbit.model;

import java.util.List;

public class InterpolationFormatClauseInfo extends CommentElement {

    private String colonToken;

    public String getColonToken() {
        return colonToken;
    }

    public void setColonToken(String colonToken) {
        this.colonToken = colonToken;
    }

    private String formatStringToken;

    public String getFormatStringToken() {
        return formatStringToken;
    }

    public void setFormatStringToken(String formatStringToken) {
        this.formatStringToken = formatStringToken;
    }
}
