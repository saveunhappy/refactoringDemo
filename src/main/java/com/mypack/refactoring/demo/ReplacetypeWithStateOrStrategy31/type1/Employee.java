package com.mypack.refactoring.demo.ReplacetypeWithStateOrStrategy31.type1;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int monthlySalary;
    private int commission;
    private int bonus;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Employee(int type) {
        this.type = type;
    }
    int payAmount(){
        switch (type){
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
