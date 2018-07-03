package me.aikin.refactoring.organizing.data.self.encapsulate.field;

public class IntRange {
    private final int low;
    private int high;

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

    public void grow(int factor) {
        high = high * factor;
    }
}
