package me.aikin.refactoring.dealing.with.generalization.pull.up.field;

public class Salesman extends Employee {
    private final String name;

    public Salesman(String name) {
        this.name = name;
    }

    public String getName() {
        return "Salesman " + name;
    }
}
