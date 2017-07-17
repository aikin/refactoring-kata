package com.refactor.commandpattern;

public class StereoOnCommand {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void on() {
        this.stereo.on();
    }
}
