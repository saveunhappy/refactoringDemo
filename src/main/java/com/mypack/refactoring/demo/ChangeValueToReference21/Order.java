package com.mypack.refactoring.demo.ChangeValueToReference21;

import java.util.Collection;
import java.util.Iterator;

public class Order {
    //和Extra class有点像
    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.getNamed(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void getCustomerName(String customerName) {
        this.customer = Customer.getNamed(customerName);
    }
    public static int numberOfOrdersFor(Collection orders, String customer){
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()){
            Order each = (Order) iter.next();

            if(each.getCustomerName().equals(customer))result++;
        }
        return result;
    }
}
