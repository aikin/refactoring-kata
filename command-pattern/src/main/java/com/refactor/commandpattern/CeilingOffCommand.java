package com.refactor.commandpattern;

public class CeilingOffCommand {
    private final Ceiling ceiling;

    public CeilingOffCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public void off() {
        this.ceiling.off();
    }
}
