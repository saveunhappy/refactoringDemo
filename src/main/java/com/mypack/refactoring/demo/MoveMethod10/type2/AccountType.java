package com.mypack.refactoring.demo.MoveMethod10.type2;

public class AccountType {
    private boolean premium;

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    double overdraftCharge(int daysOverdrawn){
        if (isPremium()){
            double result = 4.5;
            if(daysOverdrawn > 7) result +=(daysOverdrawn - 7) * 0.85;
            return result;
        }
        else {
            return daysOverdrawn * 1.75;
        }
    }
}
