package com.mypack.refactoring.demo.InlineClass13.type4;

public class Person {
    private String name;
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

}
