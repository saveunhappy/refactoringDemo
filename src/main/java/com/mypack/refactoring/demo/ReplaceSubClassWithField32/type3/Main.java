package com.mypack.refactoring.demo.ReplaceSubClassWithField32.type3;

public class Main {
    public static void main(String[] args) {
        Person p = new Male();
        Person p1 = new Female();
        //TODO
        Person p3 = Person.createFeMale();
        Person p4 = Person.createMale();
    }
}
