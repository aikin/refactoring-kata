package me.aikin.refactoring.organizing.data.change.bidirectional.association.to.unidirectional;

public class Order {
    private Customer customer;
    private String  name;


    public Order(Customer customer, String name) {
        this.customer = customer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCustomer(Customer customer) {
        if (this.customer != null) this.customer.friendOrders().remove(this);
        this.customer = customer;
        if (this.customer != null) this.customer.friendOrders().add(this);
        this.customer = customer;
    }

    public double getDiscountedPrice() {
        final double grossPrice = 10.0;
        return grossPrice * (1 - customer.getDiscount());
    }

    public Customer getCustomer() {
        return customer;
    }
}
