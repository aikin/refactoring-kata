package com.refactor.simplifying.conditional.expressions.replace.conditional.with.polymorphism;


public class Employee {

    private EmployeeType employeeType;
    private final int MonthlySalary = 100;
    private final int Commission = 20;
    private final int Bonus = 50;

    public Employee(int type) throws Exception {
        setEmployeeType(type);
    }

    private void setEmployeeType(int value) throws Exception {
        employeeType = EmployeeType.getEmployeeType(value);
    }

    public int payAmount() throws Exception {
        switch (employeeType.getEmployeeCode()) {
            case EmployeeType.ENGINEER:
                return MonthlySalary;
            case EmployeeType.SALESMAN:
                return MonthlySalary + Commission;
            case EmployeeType.MANAGER:
                return MonthlySalary + Bonus;
            default:
                throw new Exception();
        }
    }
}

