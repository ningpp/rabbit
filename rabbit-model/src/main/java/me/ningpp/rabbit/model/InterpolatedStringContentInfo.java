package me.ningpp.rabbit.model;

import java.util.List;

public class InterpolatedStringContentInfo extends CommentElement {

    private InterpolatedStringTextInfo interpolatedStringTextInfo;

    public InterpolatedStringTextInfo getInterpolatedStringTextInfo() {
        return interpolatedStringTextInfo;
    }

    public void setInterpolatedStringTextInfo(InterpolatedStringTextInfo interpolatedStringTextInfo) {
        this.interpolatedStringTextInfo = interpolatedStringTextInfo;
    }

    private InterpolationInfo interpolationInfo;

    public InterpolationInfo getInterpolationInfo() {
        return interpolationInfo;
    }

    public void setInterpolationInfo(InterpolationInfo interpolationInfo) {
        this.interpolationInfo = interpolationInfo;
    }
}
