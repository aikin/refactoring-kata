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
            lightOn();
        if (slot == 2)
            ceilingHigh();
        if (slot == 3) {
            stereoOn();
            stereo.setCdStatus(true);
            stereo.setVolume(11);
        }
    }

    private void stereoOn() {
        new StereoOnCommand(stereo).on();
    }

    private void ceilingHigh() {
        new CeilingHighCommand(ceiling).high();
    }

    private void lightOn() {
        new LightOnCommand(light).on();
    }

    public void off(int slot) {
        if (slot == 1)
            lightOff();
        if (slot == 2)
            ceilingOff();
        if (slot == 3)
            stereoOff();
    }

    private void stereoOff() {
        new StereoOffCommand(stereo).off();
    }

    private void ceilingOff() {
        new CeilingOffCommand(ceiling).off();
    }

    private void lightOff() {
        new LightOffCommand(light).off();
    }
}
