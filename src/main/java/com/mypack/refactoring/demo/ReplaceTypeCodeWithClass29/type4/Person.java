package com.mypack.refactoring.demo.ReplaceTypeCodeWithClass29.type4;

public class Person {
    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }



    public static void main(String[] args) {
        Person thePerson2 = new Person(BloodGroup.A);
        System.out.println(BloodGroup.A);
        thePerson2.setBloodGroup(BloodGroup.AB);



    }
}
