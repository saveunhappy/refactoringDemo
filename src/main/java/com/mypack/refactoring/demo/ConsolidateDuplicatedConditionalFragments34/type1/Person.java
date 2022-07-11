package com.mypack.refactoring.demo.ConsolidateDuplicatedConditionalFragments34.type1;

public class Person {
    private double total = 0.0;
    private double price = 0.1;
    private boolean isSpecialDeal(){
        return true;
    }
    private void send(){
        System.out.println("....");
    }
    private void compute(){
        if(isSpecialDeal()){
            total = price * 0.39;
            send();
        }else{
            total = price * 0.98;
            send();
        }
    }
}
