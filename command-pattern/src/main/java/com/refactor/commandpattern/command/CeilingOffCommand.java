package com.refactor.commandpattern.command;

import com.refactor.commandpattern.receiver.Ceiling;

public class CeilingOffCommand implements ICommand {
    private final Ceiling ceiling;

    public CeilingOffCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        this.ceiling.off();
    }
}
