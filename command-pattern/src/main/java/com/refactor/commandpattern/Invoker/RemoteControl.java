package com.refactor.commandpattern.Invoker;

import com.refactor.commandpattern.command.*;
import com.refactor.commandpattern.receiver.Ceiling;
import com.refactor.commandpattern.receiver.Light;
import com.refactor.commandpattern.receiver.Stereo;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<Integer, ICommand> onCommands = new HashMap<>();
    private final Map<Integer, ICommand> offCommands = new HashMap<>();

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo) {
        setOnCommand(1, new LightOnCommand(light));
        setOnCommand(2, new CeilingHighCommand(ceiling));
        setOnCommand(3, new StereoOnCommand(stereo));

        setOffCommand(1, new LightOffCommand(light));
        setOffCommand(2, new CeilingOffCommand(ceiling));
        setOffCommand(3, new StereoOffCommand(stereo));
    }

    private ICommand setOffCommand(int key, ICommand command) {
        return this.offCommands.put(key, command);
    }

    private void setOnCommand(int key, ICommand command) {
        this.onCommands.put(key, command);
    }


    public void on(int slot) {
        this.onCommands.get(slot).execute();
    }

    public void off(int slot) {
        this.offCommands.get(slot).execute();
    }
}
