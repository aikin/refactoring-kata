package me.aikin.refactoring.making.method.calls.simpler.hide.method;

import java.util.Arrays;
import java.util.List;

public class HideMethod {
    public String getLastReadingName() {
        List<String> readings = Arrays.asList("Refactoring", "Clean Code");
        return getLast(readings);
    }

    public String getLast(List<String > readings) {
        return readings.get(readings.size() - 1);
    }
}
