package me.aikin.refactoring.dealing.with.generalization.pull.up.constructor.body;

public class Manager extends Employee {
    private int grade;

    public Manager(String name, String id, int grade) {
        name = name;
        id = id;
        this.grade = grade;
        if (isPriviliged()) assignCar();
    }

    @Override
    public boolean isPriviliged() {
        return grade > 4;
    }
}


