package com.mypack.refactoring.demo.ReplaceMethodWithMethodObject8.type2;

public class Amount {
    public int delta(){
        return 200;
    }
    int gamma(int inputVal,int quantity,int yearToDate){
      return new Gamma(this,inputVal,quantity,yearToDate).compute();

    }
}
