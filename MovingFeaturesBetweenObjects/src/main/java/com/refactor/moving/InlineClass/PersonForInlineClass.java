package com.refactor.moving.InlineClass;

public class PersonForInlineClass {
    private final TelephoneNumberForInlineClass telephoneNumberForInlineClass;
    private String name;

    public PersonForInlineClass(String officeAreaCode, String officeNumber) {
        telephoneNumberForInlineClass = new TelephoneNumberForInlineClass(officeAreaCode, officeNumber);
    }


    public String getTelephoneNumber() {
        return telephoneNumberForInlineClass.getTelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
