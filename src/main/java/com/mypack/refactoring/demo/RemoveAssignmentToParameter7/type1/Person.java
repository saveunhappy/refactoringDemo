package com.mypack.refactoring.demo.RemoveAssignmentToParameter7.type1;

public class Person {
    public static void discount(int inputValue,int quantity,int yearToDate){
        if(inputValue > 50) inputValue -= 2;
    }
    //             | |
    //             | |
    //              V

    /**
     * 之所以不喜欢这样的做法，因为它降低了代码的清晰度，而且混用了按值传递和按照引用传递
     * 这两种传递方式，java只采用按值传递方式。
     * 按值传递的情况下，对参数的任何修改，都不会对调用端造成任何影响，那些用过按引用传递
     * 方式的人可能会在这一点上犯糊涂
     * 在java中，不要对参数赋值，如果你看到手上的代码已经这样做了，请使用这个方法。
     * @param inputValue
     * @param quantity
     * @param yearToDate
     */
    public static void discountTwo(int inputValue,int quantity,int yearToDate){
        int result = inputValue;
        if(inputValue > 50) result -= 2;
    }

}
