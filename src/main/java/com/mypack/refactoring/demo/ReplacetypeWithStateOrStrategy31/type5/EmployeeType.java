package com.mypack.refactoring.demo.ReplacetypeWithStateOrStrategy31.type5;

abstract public class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    abstract int getTypeCode();
    public static EmployeeType newType(int code){
        switch (code){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
