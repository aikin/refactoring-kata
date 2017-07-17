package com.refactor.commandpattern;

public class StereoOffCommand {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void off() {
        this.stereo.off();
    }
}
