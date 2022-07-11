package com.mypack.refactoring.demo.RemoveAssignmentToParameter7.type2;

public class Person {

    public static int discount(int inputValue,int quantity,int yearToDate){
        if(inputValue > 50) inputValue -= 2;
        if(quantity > 100) inputValue -= 1;
        if(yearToDate > 1000) inputValue -= 4;
        return inputValue;
    }
    //              | |
    //              | |
    //               V
    public static int discountTwo(int inputValue,int quantity,int yearToDate){
        int result = inputValue;
        if(inputValue > 50) result -= 2;
        if(quantity > 100) result -= 1;
        if(yearToDate > 1000) result -= 4;
        return result;
    }

    //              | |
    //              | |
    //               V

    /**
     * 还可以为参数加上关键词final，强制它遵循"不对参数赋值"这一个惯例
     * 其实很少用final，只是重构的时候用来测试用的，
     * @param inputValue
     * @param quantity
     * @param yearToDate
     * @return
     */
    public static int discountThree(final int inputValue,final int quantity,final int yearToDate){
        int result = inputValue;
        if(inputValue > 50) result -= 2;
        if(quantity > 100) result -= 1;
        if(yearToDate > 1000) result -= 4;
        return result;
    }



}
