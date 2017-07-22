package com.refactor.observerpattern.observer;

import com.refactor.observerpattern.ReapingMachine;

public class ReapingMachineObserver {
    private final ReapingMachine reapingMachine;

    public ReapingMachineObserver(ReapingMachine reapingMachine) {
        this.reapingMachine = reapingMachine;
    }

    public void start(int temp, int humidity) {
        if(temp > 5 & humidity > 65) {
            reapingMachine.start();
        }
    }
}
