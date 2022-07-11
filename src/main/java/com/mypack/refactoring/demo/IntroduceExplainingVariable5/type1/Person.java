package com.mypack.refactoring.demo.IntroduceExplainingVariable5.type1;

public class Person {
    private String platform;
    private String browser;
    public Integer resize;
    public boolean wasInitlized(){
        return true;
    }

    public void complex(){
        if((platform.toUpperCase().indexOf("MAC")) > -1&&
                (browser.toUpperCase().indexOf("IE")) >-1&&
        wasInitlized()&& resize > 0){
            //do something
        }
    }
}
