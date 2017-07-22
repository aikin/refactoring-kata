package com.refactor.commandpattern.command;

import com.refactor.commandpattern.receiver.Ceiling;

public class CeilingHighCommand implements ICommand{
    private final com.refactor.commandpattern.receiver.Ceiling Ceiling;

    public CeilingHighCommand(Ceiling ceiling) {
        this.Ceiling = ceiling;
    }

    @Override
    public void execute() {
        this.Ceiling.high();
    }
}
