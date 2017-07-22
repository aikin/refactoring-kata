package com.refactor.commandpattern.Invoker;

import com.refactor.commandpattern.command.ICommand;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<SlotType, ICommand> onCommands = new HashMap<>();
    private final Map<SlotType, ICommand> offCommands = new HashMap<>();

    public ICommand setOffCommand(SlotType key, ICommand command) {
        return this.offCommands.put(key, command);
    }

    public void setOnCommand(SlotType key, ICommand command) {
        this.onCommands.put(key, command);
    }


    public void on(SlotType slot) {
        this.onCommands.get(slot).execute();
    }

    public void off(SlotType slot) {
        this.offCommands.get(slot).execute();
    }

}
