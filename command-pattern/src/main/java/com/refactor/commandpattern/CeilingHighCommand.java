package com.refactor.commandpattern;

public class CeilingHighCommand {
    private final Ceiling Ceiling;

    public CeilingHighCommand(Ceiling ceiling) {
        this.Ceiling = ceiling;
    }

    public void high() {
        this.Ceiling.high();
    }
}
