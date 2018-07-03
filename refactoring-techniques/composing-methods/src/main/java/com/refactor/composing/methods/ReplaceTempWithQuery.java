package com.refactor.composing.methods;

public class ReplaceTempWithQuery {
    private final double quantity;
    private final double itemPrice;

    public ReplaceTempWithQuery(double quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000)
            discountFactor = 0.95;
        else
            discountFactor = 0.98;

        return basePrice * discountFactor;
    }
}
