package me.aikin.refactoring.dealing.with.generalization.extract.superclass;

public class Employee {

    private int annualCost;
    private String id;
    private String name;


    public Employee(String name, String id, int annualCost) {
        this.name = name;
        this.id = id;
        this.annualCost = annualCost;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


