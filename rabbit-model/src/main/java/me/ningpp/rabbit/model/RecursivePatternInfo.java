package me.ningpp.rabbit.model;

import java.util.List;

public class RecursivePatternInfo {

    private TypeInfo type;

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    private PositionalPatternClauseInfo positionalPatternClause;

    public PositionalPatternClauseInfo getPositionalPatternClause() {
        return positionalPatternClause;
    }

    public void setPositionalPatternClause(PositionalPatternClauseInfo positionalPatternClause) {
        this.positionalPatternClause = positionalPatternClause;
    }

    private PropertyPatternClauseInfo propertyPatternClause;

    public PropertyPatternClauseInfo getPropertyPatternClause() {
        return propertyPatternClause;
    }

    public void setPropertyPatternClause(PropertyPatternClauseInfo propertyPatternClause) {
        this.propertyPatternClause = propertyPatternClause;
    }

    private VariableDesignationInfo designation;

    public VariableDesignationInfo getDesignation() {
        return designation;
    }

    public void setDesignation(VariableDesignationInfo designation) {
        this.designation = designation;
    }
}
