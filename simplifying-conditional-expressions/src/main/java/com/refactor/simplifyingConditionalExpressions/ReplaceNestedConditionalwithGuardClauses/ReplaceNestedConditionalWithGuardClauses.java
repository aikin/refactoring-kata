package com.refactor.simplifyingConditionalExpressions.ReplaceNestedConditionalwithGuardClauses;

public class ReplaceNestedConditionalWithGuardClauses {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    public ReplaceNestedConditionalWithGuardClauses(boolean isDead, boolean isSeparated, boolean isRetired) {
        this.isDead = isDead;
        this.isRetired = isRetired;
        this.isSeparated = isSeparated;
    }

    public double getPayAmount() {
        double result;
        if (isDead) result = deadAmount();
        else {
            if (isSeparated) result = separatedAmount();
            else {
                if (isRetired) result = retiredAmount();
                else result = normalPayAmount();
            }
        }
        return result;
    }

    private static double normalPayAmount() {
        return 100;
    }

    private static double retiredAmount() {
        return 200;
    }

    private static double separatedAmount() {
        return 300;
    }

    private static double deadAmount() {
        return 400;
    }
}
