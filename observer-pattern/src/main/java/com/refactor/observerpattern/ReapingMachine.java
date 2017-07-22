package com.refactor.observerpattern;

public class ReapingMachine {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void Start() {
        this.status = true;
    }
}
