package com.mypack.refactoring.demo.ConsolidateConditionalExpression33.type2;

public class Person {
    private double seniority = 1.0;
    private double monthsDisable = 2.0;
    private boolean isPartTime = true;
    double disabilityAmount(){
        if((seniority < 2 || monthsDisable < 11 || isPartTime)){
            return 0;
        }
        return 1;
    }

}
