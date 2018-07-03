package me.aikin.refactoring.decorator.pattern;

public class Espresso extends Beverage {
    public Espresso(boolean milk, boolean mocha) {
        super(milk, mocha);
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        double condimentCost = 4.00;
        if (isMilk()) {
            condimentCost = condimentCost + 1.0;
        }

        if (isMocha()) {
            condimentCost = condimentCost + 3.0;
        }

        return condimentCost;
    }
}

