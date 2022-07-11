package com.mypack.refactoring.demo.IntroduceLocalExtention17.type2Sub;

import java.util.Date;

public class MfDateSub extends Date {
    public Date nextDay(){
        return new Date(getYear(),getMonth(),getDate() + 1);
    }
    public int dayOfYear(){
        return 0;
    }

    @Override
    public boolean after(Date when) {
        return super.after(when);
    }
}
