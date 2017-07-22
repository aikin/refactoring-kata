package com.refactor.commandpattern.command;

import com.refactor.commandpattern.receiver.Light;

public class LightOnCommand implements ICommand{
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
