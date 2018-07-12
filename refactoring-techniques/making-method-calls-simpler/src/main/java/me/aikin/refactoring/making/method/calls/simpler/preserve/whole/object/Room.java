package me.aikin.refactoring.making.method.calls.simpler.preserve.whole.object;

public class Room {

    public Room(TempRange tempRange) {
        this.tempRange = tempRange;
    }

    private TempRange tempRange;

    public boolean withinPlan(HeatingPlan plan) {
        int low = tempRange.getLow();
        int high = tempRange.getHigh();
        return plan.withinRange(low, high);
    }

    public void setTempRange(TempRange tempRange) {
        this.tempRange = tempRange;
    }

    public TempRange getTempRange() {
        return tempRange;
    }
}
