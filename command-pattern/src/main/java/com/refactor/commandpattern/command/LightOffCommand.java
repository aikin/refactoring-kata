package com.refactor.commandpattern.command;

import com.refactor.commandpattern.receiver.Light;

public class LightOffCommand implements ICommand {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
