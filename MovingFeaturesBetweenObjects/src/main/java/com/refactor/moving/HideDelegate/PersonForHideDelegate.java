package com.refactor.moving.HideDelegate;

public class PersonForHideDelegate {
    private DepartmentForHideDelegate ownDepartment;
    private String name;

    public PersonForHideDelegate(DepartmentForHideDelegate ownDepartment, String name) {
        this.ownDepartment = ownDepartment;
        this.name = name;
    }

    public PersonForHideDelegate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public DepartmentForHideDelegate getOwnDepartment() {
        return ownDepartment;
    }
}
