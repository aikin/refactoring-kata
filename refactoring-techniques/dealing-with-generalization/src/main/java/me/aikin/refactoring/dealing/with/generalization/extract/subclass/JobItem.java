package me.aikin.refactoring.dealing.with.generalization.extract.subclass;

public class JobItem {
    private final int unitPrice;
    private final boolean isLabor;

    private int quantity;
    private Employee employee;

    public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isLabor = isLabor;
        this.employee = employee;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    private int getUnitPrice() {
        return isLabor ? employee.getRate() : unitPrice;
    }

}
