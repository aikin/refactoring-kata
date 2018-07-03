package me.aikin.refactoring.command.pattern;

public class Stereo {
    private boolean stereoStatus;
    private boolean cdStatus;
    private int volume;

    public void on() {
        stereoStatus = true;
    }

    public void off() {
        stereoStatus = false;
        cdStatus = false;
        volume = 0;
    }

    public boolean getStereoStatus() {
        return stereoStatus;
    }

    public void setStereoStatus(boolean stereoStatus) {
        this.stereoStatus = stereoStatus;
    }

    public boolean getCdStatus() {
        return cdStatus;
    }

    public void setCdStatus(boolean cdStatus) {
        this.cdStatus = cdStatus;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
