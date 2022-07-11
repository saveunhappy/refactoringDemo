package com.mypack.refactoring.demo.ReplaceSubClassWithField32.type2;

public class Female extends Person {

    @Override
    boolean isMale() {
        return false;
    }

    @Override
    char getCode() {
        return 'F';
    }
}
