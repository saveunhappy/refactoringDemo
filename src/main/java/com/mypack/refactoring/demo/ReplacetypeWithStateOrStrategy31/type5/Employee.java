package com.mypack.refactoring.demo.ReplacetypeWithStateOrStrategy31.type5;

public class Employee {
  //  private int type;
//    static final int ENGINEER = 0;
//    static final int SALESMAN = 1;
//    static final int MANAGER = 2;
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public int getType() {
        return type.getTypeCode();
    }
//  TODO
    public void setType(int arg) {
        EmployeeType.newType(arg);
    }

//    public Employee(int type) {
//        setType(type);
//    }

    public Employee(int type) {
        setType(type);
    }
    /*
    TODO
    */
    int payAmount(){
        switch (getType()){
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
