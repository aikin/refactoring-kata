package com.refactor.moving.RemoveMiddleMan;

public class DepartmentForRemoveMiddleMan {
    private final PersonForRemoveMiddleMan manager;

    public DepartmentForRemoveMiddleMan(PersonForRemoveMiddleMan manager) {
        this.manager = manager;
    }

    public PersonForRemoveMiddleMan getManager() {
        return manager;
    }
}
