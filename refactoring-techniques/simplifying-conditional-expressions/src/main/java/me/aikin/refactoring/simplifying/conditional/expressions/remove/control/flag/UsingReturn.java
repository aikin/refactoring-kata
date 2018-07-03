package me.aikin.refactoring.simplifying.conditional.expressions.remove.control.flag;

import java.util.List;

public class UsingReturn {
    private String alertedMessage = "";

    public String checkSecurity(List<String> people) {
        String found = "";
        for (String name : people) {
            if (found == "") {
                if (name.equals("Don")) {
                    sendAlert();
                    found = "Don";
                }
                if (name.equals("John")) {
                    sendAlert();
                    found = "John";
                }
            }
        }
        return someLaterCode(found);
    }

    private String someLaterCode(String found) {
        return alertedMessage + found;
    }

    private void sendAlert() {
        alertedMessage = "Alert";
    }

}
