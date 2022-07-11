package com.mypack.refactoring.demo.ReplacetypeWithStateOrStrategy31.type2;

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return Employee.MANAGER;
    }
}
