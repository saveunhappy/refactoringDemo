package com.mypack.refactoring.demo.HideDelegate14.type1;

public class Main {
    public static void main(String[] args) {
        //就可以当成员工
        Person person = new Person();
        //要获取到员工的上级领导是谁，就得先知道他在哪个部门，然后再获取到
        //领导是谁，领导当然也是人，也是Person类型的
        /**
         * 这样的编码就是对客户揭露了Department的工作原理，于是客户知道了
         * Department用来追踪“经理”这条信息，如果对客户隐藏Department，
         * 可以减少耦合，为了这一目的，可以在Person中建立一个简单的委托函数
         */
        Person manager = person.getDepartment().getManager();

    }
}
