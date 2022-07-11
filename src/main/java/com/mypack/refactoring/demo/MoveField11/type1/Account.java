package com.mypack.refactoring.demo.MoveField11.type1;

public class Account {
    private AccountType type;
    private double interestRate;

    double interestForAmountDays(double amount,int days){
        return interestRate * amount * days / 365;
    }



    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }



}
