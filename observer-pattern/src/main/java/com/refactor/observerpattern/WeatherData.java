package com.refactor.observerpattern;

import com.refactor.observerpattern.observer.IMachineObserver;
import com.refactor.observerpattern.observer.ReapingMachineObserver;
import com.refactor.observerpattern.observer.SeedingMachineObserver;
import com.refactor.observerpattern.observer.WateringMachineObserver;

import java.util.Arrays;
import java.util.List;

public class WeatherData {
    private final SeedingMachine seedingMachine;
    private final ReapingMachine reapingMachine;
    private final WateringMachine wateringMachine;
    private List<IMachineObserver> machineObservers;

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;

        this.machineObservers = initMachineObservers();
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        machineObservers.forEach(o -> o.update(temp, humidity, windPower));
    }

    private List<IMachineObserver> initMachineObservers() {
        SeedingMachineObserver seedingMachineObserver = new SeedingMachineObserver(seedingMachine);
        ReapingMachineObserver reapingMachineObserver = new ReapingMachineObserver(reapingMachine);
        WateringMachineObserver wateringMachineObserver = new WateringMachineObserver(wateringMachine);

        return Arrays.asList(seedingMachineObserver, reapingMachineObserver, wateringMachineObserver);
    }

}
