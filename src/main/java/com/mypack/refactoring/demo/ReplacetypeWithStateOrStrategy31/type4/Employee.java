package com.mypack.refactoring.demo.ReplacetypeWithStateOrStrategy31.type4;

public class Employee {
  //  private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public int getType() {
        return type.getTypeCode();
    }
//  TODO
    public void setType(int arg) {
        switch (arg){
            case ENGINEER:
                type = new Engineer();
                break;
            case SALESMAN:
                type = new Salesman();
                break;
            case MANAGER:
                type = new Manager();
                break;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }

//    public Employee(int type) {
//        setType(type);
//    }

    public Employee(int type) {
        setType(type);
    }
    /*
    最后处理
    */
    int payAmount(){
        switch (getType()){
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
