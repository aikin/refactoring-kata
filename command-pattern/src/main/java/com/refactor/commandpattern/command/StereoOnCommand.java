package com.refactor.commandpattern.command;

import com.refactor.commandpattern.receiver.Stereo;

public class StereoOnCommand implements ICommand {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCdStatus(true);
        stereo.setVolume(11);
    }
}
