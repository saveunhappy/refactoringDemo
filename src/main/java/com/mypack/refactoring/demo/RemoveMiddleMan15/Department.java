package com.mypack.refactoring.demo.RemoveMiddleMan15;

public class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager){
        this.manager = manager;
    }
    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }
}
