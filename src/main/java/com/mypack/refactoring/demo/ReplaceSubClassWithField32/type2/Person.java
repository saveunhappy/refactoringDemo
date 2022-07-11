package com.mypack.refactoring.demo.ReplaceSubClassWithField32.type2;


abstract public class Person {
    //TODO
    public static Person createMale(){
        return new Male();
    }
    public static Person createFeMale(){
        return new Female();
    }
    abstract boolean isMale();
    abstract char getCode();
}
