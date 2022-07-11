package com.mypack.refactoring.demo.ChangeUnidirectionalAssociateToBiDirectional24.type2;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    /*
    多对多
     */
    private Set<Order> orders = new HashSet<>();
    Set<Order> friendsOrders(){
        /**
         * 只能被order用来修改关系的时候使用
         */
        return orders;
    }
    void addOrder(Order arg){
        arg.addCustomer(this);
    }
    void removeOrder(Order arg){
        arg.removeCustomer(this);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orders=" + orders +
                '}';
    }
}
