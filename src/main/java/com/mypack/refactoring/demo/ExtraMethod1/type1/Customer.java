package com.mypack.refactoring.demo.ExtraMethod1.type1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> renrals = new Vector<Rental>();

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
        Enumeration<Rental> rentals = renrals.elements();
        //print banner
        System.out.println("**************************");
        System.out.println("******Customer Owes ******");
        System.out.println("**************************");
        String result = "";
        while (rentals.hasMoreElements()){

            Rental each = rentals.nextElement();
            totalAmount += 1;

        }
       // result += "Amount owed is " + totalAmount + "\n";
        System.out.println("name:"+name);
        System.out.println("amount"+totalAmount);
        return result;
    }


}
