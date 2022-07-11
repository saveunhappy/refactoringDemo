package com.mypack.refactoring.demo.RefactoryStart.type5;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector renrals = new Vector();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addRental(Rental arg){
        renrals.addElement(arg);
    }
    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = renrals.elements();
        String result = "Rental Record for  " + getName() + "\n";
        while (rentals.hasMoreElements()){
            // 原先的   double thisAmount = 0;
            //          Rental aRental = (Rental) rentals.nextElement();
            //           thisAmount = aRental.getCharge();
            //TODO  这里就看出来问题了，你就用了一次，先定义为 0 ，再接收，thisAmount就变的多余了
            // 就是可以直接用了，比如小龙老师为了装逼，直接把代码写成一行，
            // 不过这里确实是一就够了，所以，去掉thisAmount!!!

            // author:我喜欢尽量除去这一类临时变量，临时变量往往引发问题，他们会导致大量参数被传来传去
            // 而其实完全没有这种必要，你很容易跟丢它们，尤其在常常的函数之中更是如此。
            Rental aRental = (Rental) rentals.nextElement();
            //TODO
           //thisAmount = aRental.getCharge();
            frequentRenterPoints++;
            if((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && aRental.getDayRented()>1){
                frequentRenterPoints ++;
            }
            result += "\t" + aRental.getMovie().getTitle() + "\t" +
                    aRental.getCharge() + "\n";
            totalAmount += aRental.getCharge();

        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned" + String.valueOf(frequentRenterPoints) +
                "frequent renter points";
        return result;
    }
    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }

}
