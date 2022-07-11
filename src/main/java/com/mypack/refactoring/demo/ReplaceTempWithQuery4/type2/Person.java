package com.mypack.refactoring.demo.ReplaceTempWithQuery4.type2;

public class Person {
    private int quantity;
    private int itemPrice;


    public int getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }



    public double getPrice(){
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if(basePrice > 1000){
            discountFactor = 0.95;
        }else{
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
//              | |
//              | |
//               V
    public double getPriceRefactory(){
        //先变成final的确保只背被赋值一次
        final int basePrice = basePrice();
        final double discountFactor;
        if(basePrice() > 1000){
            discountFactor = 0.95;
        }else{
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
//              | |
//              | |
//               V
    public double getPriceRefactoryTwo(){
        //先变成final的确保只背被赋值一次
        final double discountFactor;
        if(basePrice() > 1000){
            discountFactor = 0.95;
        }else{
            discountFactor = 0.98;
        }
        return basePrice() * discountFactor;
    }
//              | |
//              | |
//               V
    //这个就是先抽取最小的单位，然后再一步一步抽取，跟递归似的
    public double getPriceRefactoryThree(){
        return basePrice() * discountFactor();
    }

    private double discountFactor(){
        if(basePrice() > 1000){
            return 0.95;
        }else{
            return 0.98;
        }
    }
    int basePrice(){
        return quantity * itemPrice;
    }
    //


}
