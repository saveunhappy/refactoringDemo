package com.mypack.refactoring.demo.IntroduceLocalExtention17.type3Wrap;

import java.util.Date;

public class Person {

    public static void main(String[] args) {
        Date previousEnd = new Date();
        MfDateWrap mfDateWrap = new MfDateWrap(previousEnd);
        Date newStart = mfDateWrap.nextDay();


    }
//    private static Date nextDay(Date date){
//        return new Date(date.getYear(),date.getMonth(),date.getDate() + 1);
//    }
}
