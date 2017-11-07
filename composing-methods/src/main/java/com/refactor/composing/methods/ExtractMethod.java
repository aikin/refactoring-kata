package com.refactor.composing.methods;

import java.util.List;

public class ExtractMethod {
    private List<Order> orders;

    public ExtractMethod(List<Order> orders) {
        this.orders = orders;
    }

    public String printOwning(String name, int previousAmount) {
        String customerOwns = "";
        double outstanding = 10 + previousAmount;

        // print banner
        customerOwns += "****/n";
        customerOwns += "**Customer Owns**/n";
        customerOwns += "****/n";

        // calculate outstanding
        for (Order order : orders) {
            outstanding += order.getAmount();
        }

        //print details
        customerOwns += "name:" + name + "/n";
        customerOwns += "amount:" + outstanding;
        return customerOwns;
    }
}

