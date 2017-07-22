package com.refactor.observerpattern.observer;

import com.refactor.observerpattern.WateringMachine;

public class WateringMachineObserver implements IMachineObserver {
    private final WateringMachine wateringMachine;

    public WateringMachineObserver(WateringMachine wateringMachine) {
        this.wateringMachine = wateringMachine;
    }

    @Override
    public void update(int temp, int humidity, int windPower) {
        if (temp > 10 && humidity < 55 && windPower < 4) {
            wateringMachine.start();
        }
    }
}
