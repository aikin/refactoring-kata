package me.aikin.refactoring.simplifying.method.calls.replace.parameter.with.method.calls;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReplaceParameterWithMethodTest {
    @Test
    public void should_get_ninty_percentage_discount_given_name_is_kent() {
        PriceOfLevelCalculator priceOfLevelCalculator = new PriceOfLevelCalculator("Kent");
        double price = priceOfLevelCalculator.getPrice(10, 10);
        assertTrue(90 == price);
    }

    @Test
    public void should_not_get_discount_given_name_is_martin() {
        PriceOfLevelCalculator priceOfLevelCalculator = new PriceOfLevelCalculator("Martin");
        double price = priceOfLevelCalculator.getPrice(10, 10);
        assertTrue(100 == price);
    }

    @Test
    public void should_get_ninty_percentage_discount_given_quantity_is_over_100() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(200, 10);
        assertTrue(1800 == price);
    }

    @Test
    public void should_not_get_discount_given_quantity_is_less_than_100() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(80, 10);
        assertTrue(800 == price);
    }
}