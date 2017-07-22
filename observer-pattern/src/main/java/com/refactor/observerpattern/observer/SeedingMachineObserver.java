package com.refactor.observerpattern.observer;

import com.refactor.observerpattern.SeedingMachine;

public class SeedingMachineObserver {
    private final SeedingMachine seedingMachine;

    public SeedingMachineObserver(SeedingMachine seedingMachine) {
        this.seedingMachine = seedingMachine;
    }

    public void start(int temp) {
        if (temp > 5) {
            seedingMachine.start();
        }

    }
}
