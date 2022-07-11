package com.mypack.refactoring.demo.ChangeUnidirectionalAssociateToBiDirectional24.type2;


public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.addOrder(new Order());
        customer.addOrder(new Order());
        customer.addOrder(new Order());
        System.out.println(customer);
    }
}
