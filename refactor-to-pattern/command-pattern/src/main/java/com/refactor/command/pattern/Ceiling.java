package com.refactor.command.pattern;

public class Ceiling {


    private CeilingSpeed speed;


    public void high() {
        speed = CeilingSpeed.High;
    }

    public void medium() {
        speed = CeilingSpeed.Medium;
    }

    public void low() {
        speed = CeilingSpeed.Low;
    }

    public void off() {
        speed = CeilingSpeed.Off;
    }

    public CeilingSpeed getSpeed() {
        return speed;
    }

}
