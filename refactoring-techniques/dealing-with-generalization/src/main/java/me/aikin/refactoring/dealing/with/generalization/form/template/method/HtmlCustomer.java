package me.aikin.refactoring.dealing.with.generalization.form.template.method;

import java.util.ArrayList;
import java.util.List;

public class HtmlCustomer {
    private final List<Rental> rentals = new ArrayList<>();

    public HtmlCustomer(String name) {
        this.name = name;
    }

    private String name;

    public void addRentals(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        String result = "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";

        for (Rental each : rentals) {
            // show figures for the rental
            result += ": " + each.getCharge() + "<BR>\n";
            totalAmount += each.getCharge();
        }

        // add footer lines
        result += "<P>You owe <EM>" + totalAmount + "</EM><P>\n";
        return result;
    }
}
