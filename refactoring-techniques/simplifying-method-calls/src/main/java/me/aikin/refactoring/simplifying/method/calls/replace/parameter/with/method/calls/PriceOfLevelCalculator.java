package me.aikin.refactoring.simplifying.method.calls.replace.parameter.with.method.calls;

public class PriceOfLevelCalculator {
    private String name;

    public PriceOfLevelCalculator(String name) {
        this.name = name;
    }

    public double getPrice(int quantity, double itemPrice) {
        double basePrice = quantity * itemPrice;
        int discountLevel = getDiscountLevel();
        return getDiscountedPrice(basePrice, discountLevel);
    }

    private static double getDiscountedPrice(double basePrice, int discountLevel) {
        return discountLevel == 2 ? basePrice * 0.9 : basePrice;
    }

    private int getDiscountLevel() {
        return name.equals("Kent") ? 2 : 1;
    }

}
