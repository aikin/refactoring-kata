package me.aikin.refactoring.organizing.data.replace.type.code.with.state.or.strategy;

public class Employee {
    public final int ENGINEER = 0;
    public final int SALESMAN = 1;
    public final int MANAGER = 2;

    private int type;

    public Employee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int payAmount(int monthlySalary, int commission, int bonus) throws Exception {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new Exception();
        }
    }
}
