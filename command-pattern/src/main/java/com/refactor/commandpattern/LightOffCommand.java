package com.refactor.commandpattern;

public class LightOffCommand {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void off() {
        this.light.off();
    }
}
