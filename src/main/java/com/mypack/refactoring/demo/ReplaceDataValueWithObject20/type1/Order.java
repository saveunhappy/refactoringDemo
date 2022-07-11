package com.mypack.refactoring.demo.ReplaceDataValueWithObject20.type1;

import java.util.Collection;
import java.util.Iterator;

public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public static int numberOfOrdersFor(Collection orders,String customer){
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()){
            Order each = (Order) iter.next();
            if(each.getCustomer().equals(customer))result++;
        }
        return result;
    }
}
