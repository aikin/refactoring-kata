package me.aikin.refactoring.simplifying.method.calls.remove.setting.method;

public class Employee {
    private String id;

    public Employee(String id) {
        setId(id);
    }

    private void setId(String id) {
        this.id = id;
    }
}
