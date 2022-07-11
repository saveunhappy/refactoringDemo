package com.mypack.refactoring.demo.Refactoring;

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
    /**
     * 首先找到函数内的局部变量和参数，找到了each 和 thisAmount
     * each不会改变，任何不会被修改的变量都可以被我当成参数传入新的函数
     * 如果只有一个变量会被修改，那么我就会把它当成返回值,thisAmount是个临时变量，其
     * 值在每次循环其实处被设为0，并且在switch语句之前不会改变，所以我可以直接把新函数的返回值
     * 赋值给它
     */
    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = renrals.elements();
        String result = "Rental Record for  " + getName() + "\n";

        while (rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //每个循环里面来循环算
            switch (each.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmount +=2;
                    if(each.getDayRented() > 2){
                        thisAmount += (each.getDayRented() - 2) * 1.5;
                    }
                    break;
                 case Movie.NEW_RELEASE:
                     thisAmount += each.getDayRented() * 3;
                 case Movie.CHILERENDS:
                     thisAmount += 1.5;
                     if (each.getDayRented() > 3){
                         thisAmount += (each.getDayRented() - 3) - 1.5;
                     }
                     break;
            }
            frequentRenterPoints++;
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented()>1){
                frequentRenterPoints ++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    thisAmount + "\n";
            totalAmount += thisAmount;

        }
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints +
                " frequent renter points";
        return result;

    }

}
