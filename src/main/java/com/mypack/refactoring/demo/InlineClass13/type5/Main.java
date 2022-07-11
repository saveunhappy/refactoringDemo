package com.mypack.refactoring.demo.InlineClass13.type5;


public class Main {
    //TODO
    public static void main(String[] args) {
        /*
        Person person = new Person();
        person.getOfficeTelephone().setAreaCode("781");
         */
        //重构，知识在调用方感觉到你新增了这个函数，其实知识一层套一层，还是原来的方法
        //只是给你隐藏了，用户是无感知的。
        Person person = new Person();
        person.setAreaCode("781");

    }
}
