package com.refactor.commandpattern.command;

import com.refactor.commandpattern.receiver.Stereo;

public class StereoOffCommand implements ICommand{
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
