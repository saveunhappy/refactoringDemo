package com.mypack.refactoring.demo.ChangeUnidirectionalAssociateToBiDirectional24.type2;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private Set<Customer> customers = new HashSet<>();

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Customer> getCustomer() {
        return customers;
    }
    /*
      双向关系，多对多
     */
    void addCustomer(Customer arg){
        arg.friendsOrders().add(this);
        customers.add(arg);
    }
    void removeCustomer(Customer arg){
        arg.friendsOrders().remove(this);
        customers.remove(arg);
    }
}
