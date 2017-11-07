package com.refactor.command.pattern;

public class Light {
    private boolean status;

    public void on() {
        status = true;
    }

    public void off() {
        status = false;
    }

    public boolean status() {
        return status;
    }
}
