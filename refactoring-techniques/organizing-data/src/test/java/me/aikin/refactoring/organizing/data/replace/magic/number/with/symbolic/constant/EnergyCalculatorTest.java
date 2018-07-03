package me.aikin.refactoring.organizing.data.replace.magic.number.with.symbolic.constant;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class EnergyCalculatorTest {
    @Test
    public void should_get_potential_energy() {
        EnergyCalculator energyCalculator = new EnergyCalculator();
        double potentialEnergy = energyCalculator.potentialEnergy(10, 10);
        assertTrue(potentialEnergy == 981);
    }
}