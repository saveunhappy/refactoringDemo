package com.mypack.refactoring.demo.RefactoryStart.type4;

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
            Rental aRental = (Rental) rentals.nextElement();
            //TODO
            thisAmount = aRental.getCharge();
            frequentRenterPoints++;
            if((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && aRental.getDayRented()>1){
                frequentRenterPoints ++;
            }
            result += "\t" + aRental.getMovie().getTitle() + "\t" +
                    thisAmount + "\n";
            totalAmount += thisAmount;

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
