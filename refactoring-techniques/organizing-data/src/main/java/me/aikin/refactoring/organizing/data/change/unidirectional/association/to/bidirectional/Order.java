package me.aikin.refactoring.organizing.data.change.unidirectional.association.to.bidirectional;

public class Order {
    private String name;
    private Customer customer;

    public Order(Customer customer, String name) {
        this.customer = customer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Customer getCustomer() {
        return customer;
    }
}
