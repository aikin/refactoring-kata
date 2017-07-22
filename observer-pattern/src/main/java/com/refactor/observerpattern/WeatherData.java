package com.refactor.observerpattern;

import com.refactor.observerpattern.observer.IMachineObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private final List<IMachineObserver> machineObservers = new ArrayList<>();


    public void subscribe(IMachineObserver observer) {
        this.machineObservers.add(observer);
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        machineObservers.forEach(o -> o.update(temp, humidity, windPower));
    }

}
