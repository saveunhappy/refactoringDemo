package com.mypack.refactoring.demo.ReplacetypeWithStateOrStrategy31.type2;

public class Salesman extends EmployeeType{
    @Override
    int getTypeCode() {
        return Employee.SALESMAN;
    }
}
