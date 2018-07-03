package me.aikin.refactoring.organizing.data.change.value.to.reference;

public class Customer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
