package com.refactor.composingMethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAssignmentsToParametersTest {
    @Test
    public void should_get_discount_7_given_value_is_over_50_and_quantity_is_over_100_and_yearToEnd_is_over_10000() {
        RemoveAssignmentsToParameters removeAssignmentsToParameters = new RemoveAssignmentsToParameters();
        assertEquals(53, removeAssignmentsToParameters.discount(60, 200, 20000));
    }

    @Test
    public void should_get_discount_5_given_value_is_less_than_50_and_quantity_is_over_100_and_yearToEnd_is_over_10000() {
        RemoveAssignmentsToParameters removeAssignmentsToParameters = new RemoveAssignmentsToParameters();
        assertEquals(35, removeAssignmentsToParameters.discount(40, 200, 20000));
    }
}
