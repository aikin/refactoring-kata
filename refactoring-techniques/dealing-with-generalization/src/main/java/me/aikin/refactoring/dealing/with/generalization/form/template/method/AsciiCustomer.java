package me.aikin.refactoring.dealing.with.generalization.form.template.method;

import java.util.ArrayList;
import java.util.List;

public class AsciiCustomer {
    private final List<Rental> rentals = new ArrayList<>();

    private String name;

    public AsciiCustomer(String name) {
        this.name = name;
    }

    public void addRentals(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        String result = "Rental Record for " + name + "\n";

        for (Rental each : rentals) {
            // show figures for the rental
            result += each.getCharge() + "\n";
            totalAmount += each.getCharge();
        }

        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        return result;
    }
}
