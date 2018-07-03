package me.aikin.refactoring.moving.move.method;

public class AccountTypeForMoveMethod {
    private boolean isPremium;

    public AccountTypeForMoveMethod(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean IsPremium() {
        return isPremium;
    }
}
