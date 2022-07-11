package com.mypack.refactoring.demo.ReplaceArrayWithObject23.type3;

public class Main {
    public static void main(String[] args) {
        Performance row = new Performance();
//        row.data[0] = "liverpool";
//        row.data[1] = "15";
        row.setName("liverpool");
        row.setWins("15");
        System.out.println(row.getName());
        System.out.println(row.getWins());

    }
}
