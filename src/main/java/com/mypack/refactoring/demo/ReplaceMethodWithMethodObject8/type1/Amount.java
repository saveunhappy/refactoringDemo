package com.mypack.refactoring.demo.ReplaceMethodWithMethodObject8.type1;

public class Amount {
    public int delta(){
        return 200;
    }
    int gamma(int inputVal,int quantity,int yearToDate){
        int improtance1 = (inputVal * quantity) +  delta();
        int improtance2 = (inputVal * yearToDate) +  200;
        if((yearToDate-improtance1) > 100){
            improtance1 -= 20;
        }
        int importance3 = improtance2 * 7;
        return importance3 - 2 * improtance1;

    }
}
