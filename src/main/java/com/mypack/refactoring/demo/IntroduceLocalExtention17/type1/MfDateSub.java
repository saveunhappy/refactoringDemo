package com.mypack.refactoring.demo.IntroduceLocalExtention17.type1;

import java.util.Date;

public class MfDateSub extends Date {
    public MfDateSub (String dateString){
        super(dateString);
    }
    public MfDateSub (Date arg){
        super(arg.getTime());
    }
}
