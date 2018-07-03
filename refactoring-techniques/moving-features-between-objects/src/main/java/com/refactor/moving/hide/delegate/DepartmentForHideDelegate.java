package com.refactor.moving.hide.delegate;

public class DepartmentForHideDelegate {
    private final PersonForHideDelegate manager;

    public DepartmentForHideDelegate(PersonForHideDelegate manager) {
        this.manager = manager;
    }

    public PersonForHideDelegate getManager() {
        return manager;
    }
}


