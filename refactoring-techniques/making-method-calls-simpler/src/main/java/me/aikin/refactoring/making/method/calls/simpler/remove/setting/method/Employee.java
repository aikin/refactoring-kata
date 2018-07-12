package me.aikin.refactoring.making.method.calls.simpler.remove.setting.method;

public class Employee {
    private String id;

    public Employee(String id) {
        setId(id);
    }

    private void setId(String id) {
        this.id = id;
    }
}
