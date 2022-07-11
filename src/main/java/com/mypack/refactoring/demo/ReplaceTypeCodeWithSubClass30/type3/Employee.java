package com.mypack.refactoring.demo.ReplaceTypeCodeWithSubClass30.type3;

abstract public class  Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private Employee(int type) {
        this.type = type;
    }

    public Employee() {

    }

    abstract int getType();

    public void setType(int type) {
        this.type = type;
    }
    //由于Employee构造函数接受类型码作为一个参数，所以我必须把它替换成一个工厂函数
    public static Employee create(int type){
        switch (type){
            case ENGINEER:
                return new Enginner();
            case SALESMAN:
                return new SalesMan();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }
}
