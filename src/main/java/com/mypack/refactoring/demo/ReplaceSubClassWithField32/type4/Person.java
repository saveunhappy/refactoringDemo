package com.mypack.refactoring.demo.ReplaceSubClassWithField32.type4;


public class Person {
    //TODO
    private final boolean isMale;
    private final char code;
    public boolean isMale(){
        return isMale;
    }
    public static Person createMale(){
        return new Person(true,'M');
    }
    public static Person createFeMale(){
        return new Person(false,'F');
    }
    protected Person(boolean isMale,char code){
        this.isMale = isMale;
        this.code = code;
    }

    public char getCode() {
        return code;
    }
}
