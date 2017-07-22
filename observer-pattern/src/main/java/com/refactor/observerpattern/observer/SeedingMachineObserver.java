package com.refactor.observerpattern.observer;

import com.refactor.observerpattern.SeedingMachine;

public class SeedingMachineObserver implements IMachineObserver {
    private final SeedingMachine seedingMachine;

    public SeedingMachineObserver(SeedingMachine seedingMachine) {
        this.seedingMachine = seedingMachine;
    }

    @Override
    public void update(int temp, int humidity, int windPower) {
        if (temp > 5) {
            seedingMachine.start();
        }
    }
}
