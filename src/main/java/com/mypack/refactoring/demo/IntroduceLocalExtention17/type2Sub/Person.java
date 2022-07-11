package com.mypack.refactoring.demo.IntroduceLocalExtention17.type2Sub;

import java.util.Date;

public class Person {

    public static void main(String[] args) {
        Date previousEnd = new Date();
        Date newStart = nextDay(previousEnd);


    }
    private static Date nextDay(Date date){
        return new Date(date.getYear(),date.getMonth(),date.getDate() + 1);
    }
}
