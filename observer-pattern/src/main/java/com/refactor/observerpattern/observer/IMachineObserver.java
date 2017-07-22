package com.refactor.observerpattern.observer;

public interface IMachineObserver {
    void update(int temp, int humidity, int windPower);
}
