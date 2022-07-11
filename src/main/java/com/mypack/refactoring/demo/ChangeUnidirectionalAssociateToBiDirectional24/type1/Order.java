package com.mypack.refactoring.demo.ChangeUnidirectionalAssociateToBiDirectional24.type1;

public class Order {
    /*
    刚开始，Order引用了Customer，但是Customer并没有引用Order
     */
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }
    /*
    类之间的关联关系是各式各样的，因此修改函数的代码也会随之有差异，如果customer的值不可能是null，
    那么就可以拿掉上述的第一个null检查，但仍然需要检查传入参数是否为null，不过基本形式是相同的，先
    让对方删除指向你的指针，再将你的指针指向另一个新对象，最后让那个新对把它的指针指向你
     */
    public void setCustomer(Customer arg) {
        if(customer != null){
            customer.friendsOrders().remove(this);
        }
        this.customer = arg;
        if(customer != null){
            customer.friendsOrders().add(this);
        }
    }
}
