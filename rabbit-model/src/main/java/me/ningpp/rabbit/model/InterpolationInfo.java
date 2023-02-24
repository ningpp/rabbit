package me.ningpp.rabbit.model;

import java.util.List;

public class InterpolationInfo extends CommentElement {

    private ExpressionInfo expression;

    public ExpressionInfo getExpression() {
        return expression;
    }

    public void setExpression(ExpressionInfo expression) {
        this.expression = expression;
    }

    private InterpolationAlignmentClauseInfo alignmentClause;

    public InterpolationAlignmentClauseInfo getAlignmentClause() {
        return alignmentClause;
    }

    public void setAlignmentClause(InterpolationAlignmentClauseInfo alignmentClause) {
        this.alignmentClause = alignmentClause;
    }

    private InterpolationFormatClauseInfo formatClause;

    public InterpolationFormatClauseInfo getFormatClause() {
        return formatClause;
    }

    public void setFormatClause(InterpolationFormatClauseInfo formatClause) {
        this.formatClause = formatClause;
    }
}
