package com.refactor.commandpattern;

public class LightOnCommand {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    public void on() {
        this.light.on();
    }
}
