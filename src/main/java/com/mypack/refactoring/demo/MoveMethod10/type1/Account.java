package com.mypack.refactoring.demo.MoveMethod10.type1;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    double overdraftCharge(){
        if (type.isPremium()){
            double result = 4.5;
            if(daysOverdrawn > 7) result +=(daysOverdrawn - 7) * 0.85;
            return result;
        }
        else {
            return daysOverdrawn * 1.75;
        }
    }
    double bankCharge(){
        double result = 4.5;
        if( daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }


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
}
