package com.mypack.refactoring.demo.ReplaceMethodWithMethodObject8.type1;

public class Main {
    public static void main(String[] args) {
        Amount amount = new Amount();
        int gamma = amount.gamma(2, 2, 3);
        System.out.println(gamma);

    }
}
