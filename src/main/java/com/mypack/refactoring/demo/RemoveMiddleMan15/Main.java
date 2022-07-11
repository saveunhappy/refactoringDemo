package com.mypack.refactoring.demo.RemoveMiddleMan15;

public class Main {
    public static void main(String[] args) {
        //就可以当成员工
        Person person = new Person();
        //ok,成功隐藏
        Person manager1 = person.getDepartment().getManager();
//        Person manager2 = person.getManager();

    }
}
