package com.refactor.observerpattern;

import com.refactor.observerpattern.observer.ReapingMachineObserver;
import com.refactor.observerpattern.observer.SeedingMachineObserver;
import com.refactor.observerpattern.observer.WateringMachineObserver;

public class WeatherData {
    private final SeedingMachine seedingMachine;
    private final ReapingMachine reapingMachine;
    private final WateringMachine wateringMachine;

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        new SeedingMachineObserver(seedingMachine).start(temp);
        new ReapingMachineObserver(reapingMachine).start(temp, humidity);
        new WateringMachineObserver(wateringMachine).start(temp, humidity, windPower);
    }

}
