package com.mypack.refactoring.demo.HideDelegate14.type2;

public class Person {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    /*
    有点小巧函数的感觉了。
     */
    public Person getManager(){
        return department.getManager();
    }
}
