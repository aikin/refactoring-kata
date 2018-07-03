package me.aikin.refactoring.moving.move.field;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveFieldTest {
    @Test
    public void should_get_correct_interest_for_amount_days() {
        AccountTypeForMoveField accountTypeForMoveField = new AccountTypeForMoveField();
        float interestRate = 0.03f;

        AccountForMoveField accountForMoveField = new AccountForMoveField(accountTypeForMoveField, interestRate);

        assertEquals(0, Float.compare(30f, accountForMoveField.interestForAmountDays(1000, 365)));
    }
}