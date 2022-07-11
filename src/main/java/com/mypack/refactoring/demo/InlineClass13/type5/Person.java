package com.mypack.refactoring.demo.InlineClass13.type5;

public class Person {
    private String name;
  //  private String officeAreaCode;
   // private String officeNumber;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(TelephoneNumber officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    // TODO
    public String getTelephoneNumber(){
        return officeTelephone.getTelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaCode() {
        return officeTelephone.getAreaCode();
    }

    public void setAreaCode(String officeAreaCode) {
        officeTelephone.setAreaCode(officeAreaCode);
    }

    public String getNumber() {
        return officeTelephone.getNumber();
    }

    public void seNumber(String officeNumber) {
        officeTelephone.setNumber(officeNumber);
    }


}
