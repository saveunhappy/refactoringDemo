package com.mypack.refactoring.demo.ReplaceArrayWithObject23.type1;


public class Main {
    public static void main(String[] args) {
        String[] row = new String[3];
        row[0] = "liverpool";
        row[1] = "15";
        for (String s : row) {
            System.out.println(s);
        }
        String name = row[0];
        int wins = Integer.parseInt(row[1]);
        Integer wins1 = Integer.valueOf(row[1]);


    }
}
