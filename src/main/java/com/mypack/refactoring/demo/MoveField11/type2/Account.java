package com.mypack.refactoring.demo.MoveField11.type2;

public class Account {
    private AccountType type;

    double interestForAmountDays(double amount,int days){
        return type.getInterestRate() * amount * days / 365;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        type.setInterestRate(interestRate);
    }



}
