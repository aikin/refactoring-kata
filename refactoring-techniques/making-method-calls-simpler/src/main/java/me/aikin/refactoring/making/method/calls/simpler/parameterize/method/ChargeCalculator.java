package me.aikin.refactoring.making.method.calls.simpler.parameterize.method;

public class ChargeCalculator {
    private double lastUsage;

    public ChargeCalculator(double lastUsage) {
        this.lastUsage = lastUsage;
    }

    public double baseCharge() {
        double result = Math.min(this.lastUsage, 100) * 0.03;
        if (this.lastUsage > 100) {
            result += (Math.min(this.lastUsage, 200) - 100) * 0.05;
        }
        if (this.lastUsage > 200) {
            result += (this.lastUsage - 200) * 0.07;
        }
        return result;
    }

    public double getLastUsage() {
        return lastUsage;
    }
}
