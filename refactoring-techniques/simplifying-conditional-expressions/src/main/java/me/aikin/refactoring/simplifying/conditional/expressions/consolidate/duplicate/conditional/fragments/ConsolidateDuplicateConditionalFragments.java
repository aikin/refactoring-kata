package me.aikin.refactoring.simplifying.conditional.expressions.consolidate.duplicate.conditional.fragments;

public class ConsolidateDuplicateConditionalFragments {
    private double price;
    private double total;
    private boolean isSpecialDeal;

    public ConsolidateDuplicateConditionalFragments(boolean isSpecialDeal, double price) {
        this.isSpecialDeal = isSpecialDeal;
        this.price = price;
    }

    public double disabilityAmount() {
        if (isSpecialDeal()) {
            total = price * 0.95;
            send();
        } else {
            total = price * 0.98;
            send();
        }
        return total;
    }

    private void send() {
        total += 1;
    }

    private boolean isSpecialDeal() {
        return isSpecialDeal;
    }
}