package com.mypack.refactoring.demo.IntroduceExplainingVariable5.type2;

public class Person {

    private String platform;
    private String browser;
    public Integer resize;
    final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean isIEBrowser = browser.toUpperCase().indexOf("MAC") > -1;
    final boolean wasResized = resize > 0;


    public boolean wasInitlized(){
        return true;
    }

    /**
     *     public void complex(){
     *         if((platform.toUpperCase().indexOf("MAC")) > -1&&
     *                 (browser.toUpperCase().indexOf("IE")) >-1&&
     *         wasInitlized()&& resize > 0){
     *             //do something
     *         }
     *     }
     */

    /**
     * 把复杂表达式或者其中的一部分放进一个临时变量。，命名好。
     */

    public void complex(){
        if(isMacOs && isIEBrowser && wasInitlized()&& wasResized){
            //do something
        }
    }
}
