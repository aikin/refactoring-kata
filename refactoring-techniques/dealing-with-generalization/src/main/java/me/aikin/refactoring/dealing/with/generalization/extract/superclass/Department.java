package me.aikin.refactoring.dealing.with.generalization.extract.superclass;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final List<Employee> staffs = new ArrayList<>();

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public int getTotalAnnualCost() {
        return staffs.stream().mapToInt(Employee::getAnnualCost).sum();
    }

    public int getHeadCount() {
        return staffs.size();
    }

    public void addStaff(Employee staff) {
        staffs.add(staff);
    }

    public String getName() {
        return name;
    }
}
