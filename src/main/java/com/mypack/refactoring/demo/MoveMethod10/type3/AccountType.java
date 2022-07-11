package com.mypack.refactoring.demo.MoveMethod10.type3;

public class AccountType {
    private boolean premium;

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    /*
        这个例子中被搬运函数只引用了一个字段，所以只需将这个字段作为参数传给目标函数就行了，
        如果被搬运函数调用了Account中的另一个函数，就不能这么简单的处理，这种情况下，
        必须将源对象传递给目标函数
     */
    double overdraftCharge(Account account){
        if (isPremium()){
            double result = 4.5;
            if(account.getDaysOverdrawn() > 7) result +=(account.getDaysOverdrawn() - 7) * 0.85;
            return result;
        }
        else {
            return account.getDaysOverdrawn() * 1.75;
        }
    }
    /*
   如果需要源类的多个特性，那么我也会将源对象传递给目标函数，不过如果目标函数需要太多源类特性，
   就得进一步重构，通常这种情况下，我会分解目标函数，并将一部分移回源类。
     */
}
