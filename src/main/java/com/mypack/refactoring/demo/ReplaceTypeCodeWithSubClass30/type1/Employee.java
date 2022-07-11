package com.mypack.refactoring.demo.ReplaceTypeCodeWithSubClass30.type1;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(0);
        System.out.println(employee.getType());
    }

}
