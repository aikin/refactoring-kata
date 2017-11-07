package com.refactor.simplifying.conditional.expressions.consolidate.conditional.expression;

public class OrsExample {
    private double seniority;
    private double monthsDisabled;
    private boolean isPartTime;
    private double disabilityAmount = 10;

    public OrsExample(double seniority, double monthsDisabled, boolean isPartTime)
    {
        this.seniority = seniority;
        this.isPartTime = isPartTime;
        this.monthsDisabled = monthsDisabled;
    }

    public double disabilityAmount()
    {
        if (seniority < 2) return 0;
        if (monthsDisabled > 12) return 0;
        if (isPartTime) return 0;
        return disabilityAmount;
    }

}
