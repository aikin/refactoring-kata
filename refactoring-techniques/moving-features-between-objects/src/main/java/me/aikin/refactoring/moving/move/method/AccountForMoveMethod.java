package me.aikin.refactoring.moving.move.method;

public class AccountForMoveMethod {
    private final AccountTypeForMoveMethod type;
    private final double daysOverdrawn;

    public AccountForMoveMethod(AccountTypeForMoveMethod type, double daysOverdrawn) {
        this.type = type;
        this.daysOverdrawn = daysOverdrawn;
    }

    public double overDraftCharge() {
        if (type.IsPremium()) {
            double result = 10;
            if (daysOverdrawn > 7)
                result += (daysOverdrawn - 7) * 0.85;
            return result;
        }

        return daysOverdrawn * 1.75;
    }

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0)
            result += overDraftCharge();
        return result;
    }
}
