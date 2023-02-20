package me.ningpp.rabbit.model;

import java.util.List;

public class VariableDeclarationInfo {

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private List<VariableDeclaratorInfo> variables;

    public List<VariableDeclaratorInfo> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableDeclaratorInfo> variables) {
        this.variables = variables;
    }
}
