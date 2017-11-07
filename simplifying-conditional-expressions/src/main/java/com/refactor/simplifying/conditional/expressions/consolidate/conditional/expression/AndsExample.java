package com.refactor.simplifying.conditional.expressions.consolidate.conditional.expression;

public class AndsExample {
    private double lengthOfService;
    private boolean onVacation;

    public AndsExample(double lengthOfService, boolean onVacation) {
        this.lengthOfService = lengthOfService;
        this.onVacation = onVacation;
    }

    public double getCharge() {
        if (onVacation())
            if (lengthOfService() > 10)
                return 1;
        return 0.5;
    }

    private double lengthOfService() {
        return lengthOfService;
    }

    private boolean onVacation() {
        return onVacation;
    }

}