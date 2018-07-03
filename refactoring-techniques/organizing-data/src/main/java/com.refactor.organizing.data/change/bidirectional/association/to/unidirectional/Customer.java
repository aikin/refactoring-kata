package com.refactor.organizing.data.change.bidirectional.association.to.unidirectional;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        CustomerRepository.addCustomer(this);
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        order.setCustomer(this);
    }

    protected List<Order> friendOrders() {
        return orders;
    }

    public double getDiscount() {
        return 0.1;
    }

    public double getPriceFor(Order order) {
        return order.getDiscountedPrice();
    }
}
