package me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods;

public class EmployeeFactory {
    private final static int engineer = 0;
    private final static int salesman = 1;
    private final static int manager = 2;

    public static Employee create(int type) {
        switch (type) {
            case engineer:
                return new Engineer();
            case salesman:
                return new Salesman();
            case manager:
                return new Manager();
            default:
                throw new RuntimeException("Incorrect type code value");
        }
    }
}
