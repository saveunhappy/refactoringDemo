package com.mypack.refactoring.demo.ReplaceSubClassWithField32.type1;

public class Male extends Person{
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
