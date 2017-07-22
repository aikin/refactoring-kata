package com.refactor.commandpattern.Invoker;

import com.refactor.commandpattern.command.ICommand;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<Integer, ICommand> onCommands = new HashMap<>();
    private final Map<Integer, ICommand> offCommands = new HashMap<>();

    public ICommand setOffCommand(int key, ICommand command) {
        return this.offCommands.put(key, command);
    }

    public void setOnCommand(int key, ICommand command) {
        this.onCommands.put(key, command);
    }


    public void on(int slot) {
        this.onCommands.get(slot).execute();
    }

    public void off(int slot) {
        this.offCommands.get(slot).execute();
    }

}
