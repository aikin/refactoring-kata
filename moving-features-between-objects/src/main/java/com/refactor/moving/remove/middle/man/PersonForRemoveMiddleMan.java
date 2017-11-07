package com.refactor.moving.remove.middle.man;

public class PersonForRemoveMiddleMan {
    private DepartmentForRemoveMiddleMan department;
    private String name;

    public PersonForRemoveMiddleMan(DepartmentForRemoveMiddleMan department, String name) {
        this.department = department;
        this.name = name;
    }

    public PersonForRemoveMiddleMan(String name) {
        this.name = name;
    }


    public PersonForRemoveMiddleMan getManager() {
        return department.getManager();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
