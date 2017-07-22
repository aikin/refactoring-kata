package com.refactor.commandpattern;

public class RemoteControl {
    private final Light light;
    private final Ceiling ceiling;
    private final Stereo stereo;

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo) {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
    }



    public void on(int slot) {
        if (slot == 1)
            light.on();
        if (slot == 2)
            ceiling.high();
        if (slot == 3) {
            stereo.on();
            stereo.setCdStatus(true);
            stereo.setVolume(11);
        }
    }

    public void off(int slot) {
        if (slot == 1)
            light.off();
        if (slot == 2)
            ceiling.off();
        if (slot == 3)
            stereo.off();
    }
}
