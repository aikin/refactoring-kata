package me.aikin.refactoring.simplifying.method.calls.parameterize.method;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParameterizeMethodTest {
    @Test
    public void should_get_ten_percent_raise_of_salary() {
        SalaryCalculator salaryCalculator = new SalaryCalculator(100);
        final double result = 100 * 1.1;
        assertTrue(result == salaryCalculator.tenPercentRaise());
    }

    @Test
    public void should_get_five_percent_raise_of_salary() {
        SalaryCalculator salaryCalculator = new SalaryCalculator(100);
        assertTrue(105 == salaryCalculator.fivePercentRaise());
    }

    @Test
    public void should_charge_three_percentage_given_last_usage_is_less_than_100_according_to_level_one_rule() {
        ChargeCalculator chargeCalculator = new ChargeCalculator(100);
        assertTrue(3 == chargeCalculator.baseCharge());
    }

    @Test
    public void should_charge_five_percentage_of_last_usage_minus_100_more_than_level1_rule_given_last_usage_is_between_100_and_200_according_to_level_two_rule() {
        ChargeCalculator chargeCalculator = new ChargeCalculator(150);
        assertTrue(5.5 == chargeCalculator.baseCharge());
    }

    @Test
    public void should_charge_seven_percentage_of_last_usage_minus_200_more_than_level2_given_last_usage_is_greater_than_200_according_to_level_three_rule() {
        ChargeCalculator chargeCalculator = new ChargeCalculator(250);
        assertTrue(11.5 == chargeCalculator.baseCharge());
    }
}