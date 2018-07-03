package me.aikin.refactoring.longer;

import java.util.Date;

public class Zone {
    private Date summerEnd;
    private Date summerStart;
    private double summerRate;
    private double winterRate;


    public Zone(String rate, double winterRate, double summerRate, Date summerStart, Date summerEnd) {
        this.winterRate = winterRate;
        this.summerRate = summerRate;
        this.summerStart = summerStart;
        this.summerEnd = summerEnd;
    }

    public Date getSummerEnd() {
        return summerEnd;
    }

    public Date getSummerStart() {
        return summerStart;
    }

    public double getSummerRate() {
        return summerRate;
    }

    public double getWinterRate() {
        return winterRate;
    }
}
