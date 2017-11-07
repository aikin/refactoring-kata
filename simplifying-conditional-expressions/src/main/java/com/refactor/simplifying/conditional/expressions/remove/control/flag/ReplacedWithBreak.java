package com.refactor.simplifying.conditional.expressions.remove.control.flag;

import java.util.List;

public class ReplacedWithBreak {
    private String alertedMessage = "";

    public void checkSecurity(List<String> people) {
        Boolean found = false;
        for (String name : people) {
            if (!found) {
                if (name.equals("Don")) {
                    sendAlert();
                    found = true;
                }
                if (name.equals("John")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    private void sendAlert() {
        alertedMessage = "Alert";
    }

    public String getAlertedMessage() {
        return alertedMessage;
    }
}
