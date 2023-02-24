package me.ningpp.rabbit.model;

import java.util.List;

public class TupleExpressionInfo extends CommentElement {

    private List<ArgumentInfo> arguments;

    public List<ArgumentInfo> getArguments() {
        return arguments;
    }

    public void setArguments(List<ArgumentInfo> arguments) {
        this.arguments = arguments;
    }
}
