package me.aikin.refactoring.moving.move.field;

public class AccountForMoveField {
    private final AccountTypeForMoveField accountTypeForMoveField;
    private final float interestRate;

    public AccountForMoveField(AccountTypeForMoveField accountTypeForMoveField, float interestRate) {
        this.accountTypeForMoveField = accountTypeForMoveField;
        this.interestRate = interestRate;
    }

    public float interestForAmountDays(float amount, int days) {
        return interestRate * amount * days / 365;
    }

    public float methodIsUsingInterestRate1() {
        return interestRate * 2;
    }

    public float methodIsUsingInterestRate2() {
        return interestRate * 3;
    }
}


