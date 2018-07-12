package me.aikin.refactoring.making.method.calls.simpler.parameterize.method;

public class SalaryCalculator {
    private double salary;

    public SalaryCalculator(double salary) {
        this.salary = salary;
    }

    public double tenPercentRaise() {
        salary *= 1.1;
        return salary;
    }

    public double fivePercentRaise() {
        salary *= 1.05;
        return salary;
    }
}
