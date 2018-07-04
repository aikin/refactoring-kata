package me.aikin.refactoring.dealing.with.generalization.extract.interfaces;

public class Employee {
    private final int rate;
    private final boolean specialSkill;

    public Employee(int rate, boolean specialSkill) {
        this.rate = rate;
        this.specialSkill = specialSkill;
    }

    public int getRate() {
        return rate;
    }

    public boolean hasSpecialSkill() {
        return specialSkill;
    }
}

