package com.refactor.observerpattern;


import com.refactor.observerpattern.observer.ReapingMachineObserver;
import com.refactor.observerpattern.observer.SeedingMachineObserver;
import com.refactor.observerpattern.observer.WateringMachineObserver;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WeatherDataTest {


    @Test
    public void seeding_machine_should_start_if_temperature_over_5_degree() {
        WeatherData weatherData = new WeatherData();
        SeedingMachine seedingMachine = new SeedingMachine();
        weatherData.subscribe(new SeedingMachineObserver(seedingMachine));

        weatherData.measurementsChanged(10, 0, 0);

        assertTrue(seedingMachine.getStatus());
    }

    @Test
    public void reaping_machine_should_start_if_temperature_over_5_degree_and_humidity_over_65() {
        WeatherData weatherData = new WeatherData();
        ReapingMachine reapingMachine = new ReapingMachine();
        weatherData.subscribe(new ReapingMachineObserver(reapingMachine));

        weatherData.measurementsChanged(10, 70, 0);

        assertTrue(reapingMachine.getStatus());
    }

    @Test
    public void water_machine_should_start_if_temperature_over_10_degree_and_humidity_less_than_55_and_wind_power_less_than_4() {
        WeatherData weatherData = new WeatherData();
        WateringMachine wateringMachine = new WateringMachine();
        weatherData.subscribe(new WateringMachineObserver(wateringMachine));

        weatherData.measurementsChanged(12, 50, 2);

        assertTrue(wateringMachine.getStatus());
    }

}