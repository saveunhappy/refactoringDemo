package com.mypack.refactoring.demo.ChangeValueToReference21;

import java.util.HashMap;
import java.util.Map;

public class Customer {
//    public Customer(String name) {
//        this.name = name;
//    }
    private static Map<String,Object> instance = new HashMap<>();
    public static void loadCustomers(){
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();

    }
    private void store(){
        instance.put(this.getName(),this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;
    //工厂模式
//    public static Customer create(String name){
//        return new Customer(name);
//    }
    //修改工厂模式，从map中获取，再修改一下名字
    public static Customer getNamed(String name){
        return (Customer) instance.get(name);
    }
    //私有化构造器
    private Customer(String name){
        this.name = name;
    }

}
