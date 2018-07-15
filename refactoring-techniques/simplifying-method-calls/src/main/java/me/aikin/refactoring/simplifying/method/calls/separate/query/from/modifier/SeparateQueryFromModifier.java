package me.aikin.refactoring.simplifying.method.calls.separate.query.from.modifier;

public class SeparateQueryFromModifier {
    private String alertedMessage;

    public String checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        return someLaterCode(found);
    }

    private String someLaterCode(String found) {
        return alertedMessage + found;
    }

    private String foundMiscreant(String[] peopleNames) {
        for (String name : peopleNames) {
            if (name.equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (name.equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {
        alertedMessage = "Alert";
    }
}
