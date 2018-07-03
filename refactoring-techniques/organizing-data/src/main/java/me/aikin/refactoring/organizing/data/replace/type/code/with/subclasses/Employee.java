package me.aikin.refactoring.organizing.data.replace.type.code.with.subclasses;

public class Employee {
    public static int ENGINEER = 0;
    public static int SALESMAN = 1;
    public static int MANAGER = 2;

    private int type;

    public Employee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
