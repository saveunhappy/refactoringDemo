package com.mypack.refactoring.demo.ExtractClass12.type2;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    private TelephoneNumber officeTelephone = new TelephoneNumber();
    public String getTelephoneNumber(){
        return ("(" + officeAreaCode + ")" + officeNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
