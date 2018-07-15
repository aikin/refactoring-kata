package me.aikin.refactoring.simplifying.method.calls.replace.parameter.with.method.calls;

public class PriceCalculator {
    public double getPrice(int quantity, double itemPrice) {
        double basePrice = quantity * itemPrice;
        int discountLevel;
        if (quantity > 100) discountLevel = 2;
        else discountLevel = 1;
        double finalPrice = getDiscountedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private static double getDiscountedPrice(double basePrice, int discountLevel) {
        return discountLevel == 2 ? basePrice * 0.9 : basePrice;
    }
}
