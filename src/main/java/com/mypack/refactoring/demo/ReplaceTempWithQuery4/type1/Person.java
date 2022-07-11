package com.mypack.refactoring.demo.ReplaceTempWithQuery4.type1;

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



    public int getPrice(){
        int basePrice = quantity * itemPrice;
        if(basePrice > 1000){
            return basePrice * 2;
        }else{
            return basePrice * 3;
        }
    }
//              | |
//              | |
//               V

    /**
     * 当程序以一个临时变量保存某一个表达式的运算结果，想办法用函数替换，
     * 如果临时变量仅仅在函数内可见，那么你为了访问，得写更长的函数，还是趁早抽取的好。
     * 如果有多个临时变量呢？且听下回分解
     * @return
     */
    public int getPriceRefactory(){
        if(basePrice() > 1000){
            return basePrice() * 2;
        }else{
            return basePrice() * 3;
        }
    }
    int basePrice(){
        return quantity * itemPrice;
    }
    //


}
