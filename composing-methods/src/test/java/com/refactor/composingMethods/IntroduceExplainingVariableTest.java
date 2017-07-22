package com.refactor.composingMethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntroduceExplainingVariableTest {
    @Test
    public void should_get_true_given_platform_is_MAC_and_browser_is_IE_and_resize_is_1() {
        IntroduceExplainingVariableBrowser introduceVariable = new IntroduceExplainingVariableBrowser();
        assertTrue(introduceVariable.isResizableIEInMac("MAC", "IE", 1));
    }

    @Test
    public void should_get_false_given_platform_is_Windows_and_browser_is_Chrome_and_resize_is_0() {
        IntroduceExplainingVariableBrowser introduceVariable = new IntroduceExplainingVariableBrowser();
        assertFalse(introduceVariable.isResizableIEInMac("Windows", "Chrome", 0));
    }

    @Test
    public void should_get_right_given_quantity_is_1000_and_item_price_is_2() {
        IntroduceExplainingVariablePrice introduceVariable = new IntroduceExplainingVariablePrice(1000, 2);
        assertEquals(2050, introduceVariable.getPrice(), 2);
    }

    @Test
    public void should_get_right_given_quantity_is_200_and_item_price_is_60() {
        IntroduceExplainingVariablePrice introduceVariable = new IntroduceExplainingVariablePrice(200, 2);
        assertEquals(440, introduceVariable.getPrice(), 2);
    }
}
