package me.aikin.refactoring.longer;

public class BusinessSite {
    private Reading[] readings = new Reading[1000];
    private static final double START_RATE = 0.09;
    private static double END_RATE = 0.05;
    private static int END_AMOUNT = 1000;

    public void addReading(Reading newReading) {
        readings[++lastReading] = newReading;
    }

    private int lastReading;

    public Dollars charge() {
        int usage = readings[lastReading].getAmount() - readings[lastReading - 1].getAmount();
        return charge(usage);
    }

    private Dollars charge(int usage) {
        Dollars result;
        if (usage == 0) return new Dollars(0);
        double t1 = START_RATE - ((END_RATE * END_AMOUNT) - START_RATE) / (END_AMOUNT - 1);
        double t2 = ((END_RATE * END_AMOUNT) - START_RATE) * Math.min(END_AMOUNT, usage) /
                (END_AMOUNT - 1);
        double t3 = Math.max(usage - END_AMOUNT, 0) * END_RATE;

        result = new Dollars(t1 + t2 + t3);

        result = result.plus(new Dollars(usage * 0.0175));

        Dollars base1 = new Dollars(result.min(new Dollars(50)).times(0.07));
        if (result.isGreaterThan(new Dollars(50))) {
            base1 = new Dollars(base1.plus(result.min(new Dollars(75)).minus(
                    new Dollars(50)).times(0.06)
            ));
        }
        if (result.isGreaterThan(new Dollars(75))) {
            base1 = new Dollars(base1.plus(result.minus(new Dollars(75)).times(0.05)));
        }
        result = result.plus(base1);
        return result;

    }
}
