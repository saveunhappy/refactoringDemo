package com.mypack.refactoring.demo.RefactoryStart.type4;


import com.mypack.refactoring.demo.Refactoring.TestModel;

public class Test01 {
    public static void main(String[] args) {

        TestModel.test();





















    }
    public double test111(){
        double quantity = 0; double itemPrice = 0;
        double basePrice = quantity * itemPrice;
        if(basePrice > 1000){
            return basePrice * 0.95;
        }
        else{
            return basePrice * 0.98;
        }
    }
//    public double test1111(){
//        double quantity = 0;double itemPrice = 0;
//
//        if(basePrice() > 1000){
//            return basePrice() * 0.95;
//        }
//        else{
//            return basePrice * 0.98;
//        }
//        double basePrice(){
//            return quantity * itemPrice;
//        }
//    }
}
