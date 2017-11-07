package com.refactor.observer.pattern;

public class ReapingMachine {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void start() {
        this.status = true;
    }
}
