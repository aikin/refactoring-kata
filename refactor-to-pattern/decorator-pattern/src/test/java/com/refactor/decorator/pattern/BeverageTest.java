package com.refactor.decorator.pattern;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class BeverageTest {
    @Test
    public void should_pay_1_when_buy_espresso() {
        Espresso espresso = new Espresso(false, false);

        assertTrue(espresso.cost() == 4.0);
    }

    @Test
    public void should_pay_5_when_buy_espresso_with_milk() {
        Espresso espresso = new Espresso(true, false);

        assertTrue(espresso.cost() == 5.0);
    }

    @Test
    public void should_pay_7_when_buy_espresso_with_mocha() {
        Espresso espresso = new Espresso(false, true);

        assertTrue(espresso.cost() == 7.0);
    }

    @Test
    public void should_pay_8_when_buy_espresso_with_milk_and_mocha() {
        Espresso espresso = new Espresso(true, true);

        assertTrue(espresso.cost() == 8.0);
    }

    @Test
    public void should_return_espresso_when_get_espresso_description() {
        Espresso espresso = new Espresso(false, false);

        assertTrue(Objects.equals(espresso.getDescription(), "Espresso"));
    }
}
