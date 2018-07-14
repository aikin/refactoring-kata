package me.aikin.refactoring.simplifying.method.calls.replace.parameter.with.explicit.methods;

public class EmployeeFactory {
    private final static int engineer = 0;
    private final static int salesman = 1;
    private final static int manager = 2;

    public static me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Employee create(int type) {
        switch (type) {
            case engineer:
                return new me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Engineer();
            case salesman:
                return new me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Salesman();
            case manager:
                return new me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Manager();
            default:
                throw new RuntimeException("Incorrect type code value");
        }
    }
}
