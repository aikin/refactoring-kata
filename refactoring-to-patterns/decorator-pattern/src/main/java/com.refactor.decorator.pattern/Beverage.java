package com.refactor.decorator.pattern;

public abstract class Beverage {
    private  boolean milk;
    private  boolean mocha;

    protected Beverage(boolean milk, boolean mocha) {
        this.milk = milk;
        this.mocha = mocha;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isMocha() {
        return mocha;
    }

    public String getDescription() {
        return "";
    }

    public abstract double cost();
}
