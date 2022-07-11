package com.mypack.refactoring.demo.MoveMethod10.type2;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public int getDaysOverdrawn() {
        return daysOverdrawn;
    }

    public void setDaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }
    double overdraftCharge(){
       return type.overdraftCharge(daysOverdrawn);
    }
    double bankCharge(){
        double result = 4.5;
        if( daysOverdrawn > 0) result += type.overdraftCharge(daysOverdrawn);
        return result;
    }
}
