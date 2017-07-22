package com.refactor.observerpattern.observer;

import com.refactor.observerpattern.ReapingMachine;

public class ReapingMachineObserver implements IMachineObserver {
    private final ReapingMachine reapingMachine;

    public ReapingMachineObserver(ReapingMachine reapingMachine) {
        this.reapingMachine = reapingMachine;
    }

    @Override
    public void update(int temp, int humidity, int windPower) {
        if(temp > 5 & humidity > 65) {
            reapingMachine.start();
        }
    }
}
