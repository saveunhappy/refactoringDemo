package com.mypack.refactoring.demo.ReplaceTypeCodeWithClass29.type2;

public class Person {
    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();
   // private int bloodGroup;
    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Person(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    //rename
    public int getBloodGroupCode() {
        return bloodGroup.getCode();
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    public static void main(String[] args) {
        Person thePerson = new Person(Person.A);
        thePerson.getBloodGroupCode();
        thePerson.setBloodGroup(Person.AB);

        Person thePerson2 = new Person(BloodGroup.A);
        thePerson2.getBloodGroup().getCode();
        thePerson2.setBloodGroup(BloodGroup.AB);



    }
}
