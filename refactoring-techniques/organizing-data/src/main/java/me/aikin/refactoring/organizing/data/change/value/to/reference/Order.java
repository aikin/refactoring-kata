package me.aikin.refactoring.organizing.data.change.value.to.reference;

public class Order {
    private Customer customer;

    public Order(String customer) {
        this.customer = new Customer(customer);
    }

    public Customer getCustomer() {
        return customer;
    }
}
