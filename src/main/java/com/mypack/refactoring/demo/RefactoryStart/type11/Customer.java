package com.mypack.refactoring.demo.RefactoryStart.type11;

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
        Enumeration rentals = renrals.elements();
        String result = "Rental Record for  " + getName() + "\n";
        while (rentals.hasMoreElements()){

            Rental aRental = (Rental) rentals.nextElement();
            result += "\t" + aRental.getMovie().getTitle() + "\t" +
                    aRental.getCharge() + "\n";
        }
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned" + getTotalFrequentRenterPoints() +
                "frequent renter points";
        return result;
    }

    public String htmlStatement(){
        Enumeration rentals = renrals.elements();
        String result = "<H1>Rental Record for <EM> " + getName() + "<EM></H1><P>\n";
        while (rentals.hasMoreElements()){

            Rental aRental = (Rental) rentals.nextElement();
            result += "\t" + aRental.getMovie().getTitle() + "\t" +
                    aRental.getCharge() + "\n";
        }
        result += "<P>  You owed <EM> " + getTotalCharge() + "</EM><P>\n";
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
    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }

}
