public class PersonForExtractClass {
    private final String officeNumber;
    private final String officeAreaCode;
    private String name;

    public PersonForExtractClass(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }


    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") ") + officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
