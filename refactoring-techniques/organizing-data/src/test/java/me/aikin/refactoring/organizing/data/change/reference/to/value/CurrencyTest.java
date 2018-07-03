package me.aikin.refactoring.organizing.data.change.reference.to.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {

    @Test
    public void should_two_currencies_with_the_same_unit_are_equal() {
        Currency usdCurrency1 = new Currency("USD");
        Currency usdCurrency2 = new Currency("USD");

        assertEquals(usdCurrency1.getCode(), usdCurrency2.getCode());
        // Should Pass
//            assertEquals(usdCurrency1, usdCurrency2);
    }
}