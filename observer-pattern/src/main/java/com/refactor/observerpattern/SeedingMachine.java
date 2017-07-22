package com.refactor.observerpattern;

public class SeedingMachine {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void Start() {
        this.status = true;
    }
}
