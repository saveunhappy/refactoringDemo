package com.mypack.refactoring.demo.ExtraMethod1.type3;

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
        printBanner();
        double totalAmount = getOutstanding();
        printDetails(totalAmount);
//----------------------------------------
        String  result = "Amount owed is " + totalAmount + "\n";
        return "";
    }

    private void printDetails(double totalAmount) {
        System.out.println("name:"+name);
        System.out.println("amount"+totalAmount);
    }

    private void printBanner() {
        System.out.println("**************************");
        System.out.println("******Customer Owes ******");
        System.out.println("**************************");
    }
    //TODO  一定要有一个良好的命名规范
    private double getOutstanding(){
        Enumeration<Rental> rentals = renrals.elements();
        double result = 0;
        while (rentals.hasMoreElements()){

            Rental each = rentals.nextElement();
            result += 1;
        }
        return result;
    }


}
