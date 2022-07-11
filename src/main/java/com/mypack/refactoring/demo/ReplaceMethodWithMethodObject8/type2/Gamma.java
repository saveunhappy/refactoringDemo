package com.mypack.refactoring.demo.ReplaceMethodWithMethodObject8.type2;

public class Gamma {
    //为了把这个函数变成一个函数对象，先声明一个类，用一个final字段用来保存源对象，
    //每一个参数和每一个临时变量，也以一个字段保存

    private final Amount amount;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    //加一个构造函数
    public Gamma(Amount amount, int inputVal, int quantity, int yearToDate) {
        this.amount = amount;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }
    //临时变量也抽取出来了
    private int improtance1;
    private int improtance2;
    private int improtance3;
    //把原来的函数内衣搬移到这里
    int compute(){
         improtance1 = (inputVal * quantity) + amount.delta();
         improtance2 = (inputVal * yearToDate) +  200;
         improtance3 = improtance2 * 7;
         importantThings();
         return improtance3 - 2 * improtance1;
    }
    //这样还能够抽取出来一个方法
    void importantThings(){
        if((yearToDate-improtance1) > 100){
            improtance1 -= 20;
        }
    }
}
