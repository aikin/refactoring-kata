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

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        SeedingMachineObserver seedingMachineObserver = new SeedingMachineObserver(seedingMachine);
        ReapingMachineObserver reapingMachineObserver = new ReapingMachineObserver(reapingMachine);
        WateringMachineObserver wateringMachineObserver = new WateringMachineObserver(wateringMachine);

        List<IMachineObserver> machineObservers = Arrays.asList(seedingMachineObserver, reapingMachineObserver, wateringMachineObserver);

        machineObservers.forEach(o -> o.update(temp, humidity, windPower));
    }

}
