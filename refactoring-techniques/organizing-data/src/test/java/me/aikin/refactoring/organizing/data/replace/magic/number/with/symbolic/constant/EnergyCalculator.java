package me.aikin.refactoring.organizing.data.replace.magic.number.with.symbolic.constant;

public class EnergyCalculator {
    public double potentialEnergy(double mass, double height) {
        return mass * height * 9.81;
    }
}
