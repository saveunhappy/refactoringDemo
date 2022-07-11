package com.mypack.refactoring.demo.ChangeReferenceToValue22;

public class Currency {
    //在ChangeValueToReference中说过，要在引用对象和值对象之间做出选择有时并不容易
    //做出选择后，你常会需要一条回头路/
    /**
     * 值对象有一个非常重要的特性，她们应该是不可变的，无论何时，只要你调用同一对象的同一个函数
     * 进行查询，都应该得到同样结果，如果保证了这一点，就可以放心的以多个对象表示同一个事物，
     * 如果值对象是可变的，你就必须确保某一对象的修改会自动更新其他“代表相同事物”的对象，
     * 这太痛苦了，与其如此还不如把它改成引用对象
     * 解释一下这里的“不可变”的意思。如果你以Money类表示“钱的概念”，其中有”币种“和金额两条信息
     * 如果Money对象通常是一个不可变的值对象，这并非以为着你的薪资不能改变，而是意味：如果要改变你的
     * 薪资，就需要使用另一个Money对象来取代现有的Money对象，而不是在现有的Money对象上修改，
     * 你和Money对象的关系可以改变，但是Money对象自身不能改变。
     */

    /*
    这个类所做的就是保存并返回一个货币种类代码，它是一个引用对象，所以如果要得到它的实例。必须这么做：
    Currency usd = Currency.get("USD");
    Currency类维护了一个包含所有Currency实例的链表，不能直接使用构造函数类创建实例，因为Currency
    构造函数是private的
    new Currency("USD").equals(new Currency("USD"))  // return false
    要把一个引用对象变成值对象，关键动作是：检查它是否不可变，如果不是，我就不能使用这项重构，因为
    可变的值对象会造成烦人的别名问题
    在这里，Currency对象是不可变的，所以下一步就是为它定义equals();

     */
    @Override
    public boolean equals(Object arg){
        if(!(arg instanceof Currency))return false;
        Currency other = (Currency)arg;
        return (code.equals(other.code));
    }
    /*
    定义了equals()就必须同时定义hashCode()实现hashCode()有个简单办法：读取equals
    使用的所有字段的hash码，然后对它们进行按位异或(^)操作，本例中，这很容易实现，因为equals
    只使用了一个字段
    hashCode和equals方法必须同时修改
    new Currency("USD").equals(new Currency("USD"))  // now return true
     */
    @Override
    public int hashCode(){
        return code.hashCode();
    }


    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
