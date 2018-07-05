package me.aikin.refactoring.dealing.with.generalization.pull.up.constructor.body;

public class Employee {
    protected String name;
    protected String id;

    private boolean isCarAssigned;

    public boolean isPriviliged() {
        return false;
    }

    protected void assignCar() {
        isCarAssigned = true;
    }

    public boolean isCarAssigned() {
        return isCarAssigned;
    }
}


