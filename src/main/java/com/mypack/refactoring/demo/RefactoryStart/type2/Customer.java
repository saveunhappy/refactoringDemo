package com.mypack.refactoring.demo.RefactoryStart.type2;

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

            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            thisAmount = amountFor(each);
            frequentRenterPoints++;
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented()>1){
                frequentRenterPoints ++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    thisAmount + "\n";
            totalAmount += thisAmount;

        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned" + String.valueOf(frequentRenterPoints) +
                "frequent renter points";
        return result;
    }
    //记住，这里应该返回double，可能因为平时都是用的int，小错误，
    //重构技术就是以微小的步伐修改程序，如果你犯下错误，很容易便可发现它
    private double amountFor(Rental aRental){

        // TODO
        double result = 0;
        switch (aRental.getMovie().getPriceCode()){
            case Movie.REGULAR:
                result +=2;
                if(aRental.getDayRented() > 2){
                    result += (aRental.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += aRental.getDayRented() * 3;
                break;
            case Movie.CHILERENDS:
                result += 1.5;
                if (aRental.getDayRented() > 3){
                    result += (aRental.getDayRented() - 3) - 1.5;
                }
                break;
        }
        return result;
    }

}
