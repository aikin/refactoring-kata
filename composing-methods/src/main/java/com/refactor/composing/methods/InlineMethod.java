package com.refactor.composing.methods;

public class InlineMethod {
    private final double numberOfLateDeliveries;

    public InlineMethod(double numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    public int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    private Boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}


