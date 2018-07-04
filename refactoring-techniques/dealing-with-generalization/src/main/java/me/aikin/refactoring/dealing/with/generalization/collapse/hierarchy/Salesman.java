package me.aikin.refactoring.dealing.with.generalization.collapse.hierarchy;

public class Salesman extends Employee {
    private final int rate;

    public Salesman(int rate) {
        this.rate = rate;
    }

    @Override
    public double getQuota() {
        return 100;
    }

    public int getRate() {
        return rate;
    }
}
