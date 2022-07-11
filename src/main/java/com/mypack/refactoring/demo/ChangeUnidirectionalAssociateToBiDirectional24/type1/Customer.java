package com.mypack.refactoring.demo.ChangeUnidirectionalAssociateToBiDirectional24.type1;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    /*
    变成双向关系的话，首先就添加一个字段，由于一个用户可以拥有多份订单，所以
    这个新增字段应该是个集合，我不希望同一份订单在同一个集合中出现一次以上，所以这里适合用set
    1.如果两者都是引用对象，而其中间的关联是“一对多”关系，那么就由“拥有单一引用”的那一方承担
    “控制者”角色，就本例而言，如果一个客户可拥有多份订单，那么就由Order类(订单)来控制关联关系
    2.如果某个对象是组成另一对象的部件，那么由后者控制关联关系
    3.如果两者都是引用对象s，而其间的对象都是多对多，那么随便其中哪个对象来控制关联关系都无所谓
     */
    private Set<Order> orders = new HashSet<>();
    Set<Order> friendsOrders(){
        /**
         * 只能被order用来修改关系的时候使用
         */
        return orders;
    }
    //如果你希望在Customer中也能修改连接，就让它调用控制函数
    void addOrder(Order arg){
        arg.setCustomer(this);
    }
}
