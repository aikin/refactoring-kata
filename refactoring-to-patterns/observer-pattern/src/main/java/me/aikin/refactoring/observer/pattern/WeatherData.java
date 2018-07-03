package me.aikin.refactoring.observer.pattern;

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
        if (temp > 5) {
            seedingMachine.start();

            if (humidity > 65)
                reapingMachine.start();
        }

        if (temp > 10 && humidity < 55 && windPower < 4)
            wateringMachine.start();
    }
}
