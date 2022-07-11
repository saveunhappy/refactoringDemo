package com.mypack.refactoring.demo.RefactoryStart.type7;

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
        //  TODO 去除了临时变量
      //  double totalAmount = 0;
    //    int frequentRenterPoints = 0;
        Enumeration rentals = renrals.elements();
        String result = "Rental Record for  " + getName() + "\n";
        while (rentals.hasMoreElements()){

            Rental aRental = (Rental) rentals.nextElement();
    //        frequentRenterPoints += aRental.getFrequentRenterPoints();
            result += "\t" + aRental.getMovie().getTitle() + "\t" +
                    aRental.getCharge() + "\n";
            //TODO 去除了临时变量，直接把这段话给抽取出来了，又给重复了一遍，就为了去掉这个临时变量
         //   totalAmount += aRental.getCharge();

        }
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned" + getTotalFrequentRenterPoints() +
                "frequent renter points";
        return result;
    }
    // TODO
    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = renrals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    // TODO
    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = renrals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}
