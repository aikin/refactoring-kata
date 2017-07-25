package com.refactor.moving.HideDelegate;

public class DepartmentForHideDelegate {
    private final PersonForHideDelegate manager;

    public DepartmentForHideDelegate(PersonForHideDelegate manager) {
        this.manager = manager;
    }

    public PersonForHideDelegate getManager() {
        return manager;
    }
}


