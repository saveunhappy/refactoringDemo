package com.mypack.refactoring.demo.ReplaceDataValueWithObject20.type2;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

}
