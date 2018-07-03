package com.refactor.observer.pattern;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WeatherDataTest {

    private final SeedingMachine seedingMachine = new SeedingMachine();
    private final ReapingMachine reapingMachine = new ReapingMachine();
    private final WateringMachine wateringMachine = new WateringMachine();
    private final WeatherData weatherData;

    public WeatherDataTest() {
        weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);
    }

    @Test
    public void seeding_machine_should_start_if_temperature_over_5_degree() {
        weatherData.measurementsChanged(10, 0, 0);

        assertTrue(seedingMachine.getStatus());
    }

    @Test
    public void reaping_machine_should_start_if_temperature_over_5_degree_and_humidity_over_65() {
        weatherData.measurementsChanged(10, 70, 0);
        assertTrue(reapingMachine.getStatus());
    }

    @Test
    public void water_machine_should_start_if_temperature_over_10_degree_and_humidity_less_than_55_and_wind_power_less_than_4() {
        weatherData.measurementsChanged(12, 50, 2);
        assertTrue(wateringMachine.getStatus());
    }

}