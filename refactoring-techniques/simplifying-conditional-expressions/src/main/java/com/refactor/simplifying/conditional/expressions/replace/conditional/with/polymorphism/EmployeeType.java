package com.refactor.simplifying.conditional.expressions.replace.conditional.with.polymorphism;

public abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public abstract int getEmployeeCode();

    public static EmployeeType getEmployeeType(int value) throws Exception {
        switch (value) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new SalesMan();
            case MANAGER:
                return new Manager();
            default:
                throw new Exception();
        }
    }
}

