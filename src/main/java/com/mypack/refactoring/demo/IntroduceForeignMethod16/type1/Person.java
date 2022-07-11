package com.mypack.refactoring.demo.IntroduceForeignMethod16.type1;

import java.util.Date;

public class Person {
    public static void main(String[] args) {
        Date previousEnd = new Date();
        Date newStart = new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate() + 1);

    }
}
