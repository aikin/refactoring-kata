package com.refactor.moving.move.method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveMethodTest {
    @Test
    public void should_not_get_over_draft_charge_given_is_premium_and_days_over_drawn_less_than_seven_days() {
        final boolean isPremium = true;
        AccountTypeForMoveMethod accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
        AccountForMoveMethod accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 6);
        assertEquals(0, Double.compare(14.5d, accountForMoveMethod.bankCharge()));

    }


    @Test
    public void should_get_over_draft_charge_given_is_premium_and_days_over_drawn_more_than_seven_days() {
        final boolean isPremium = true;
        AccountTypeForMoveMethod accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
        AccountForMoveMethod accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 8);
        assertEquals(0, Double.compare(15.35d, accountForMoveMethod.bankCharge()));
    }

    @Test
    public void should_get_over_draft_charge_given_is_not_premium() {
        final boolean isPremium = false;
        AccountTypeForMoveMethod accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
        AccountForMoveMethod accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 6);
        assertEquals(0, Double.compare(15d, accountForMoveMethod.bankCharge()));
    }

    @Test
    public void should_not_get_over_draft_charge_given_days_over_drawn_is_zero() {
        final boolean isPremium = false;
        AccountTypeForMoveMethod accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
        AccountForMoveMethod accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 0);
        assertEquals(0, Double.compare(4.5d, accountForMoveMethod.bankCharge()));
    }
}