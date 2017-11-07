package com.refactor.moving.InlineClass;

public class TelephoneNumberForInlineClass {
    private final String officeAreaCode;
    private final String officeNumber;

    public TelephoneNumberForInlineClass(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") ") + officeNumber;
    }
}





