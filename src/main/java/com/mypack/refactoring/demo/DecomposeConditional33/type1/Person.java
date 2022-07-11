package com.mypack.refactoring.demo.DecomposeConditional33.type1;

import java.math.BigDecimal;
import java.util.Date;

public class Person {
    private Date date = new Date();
    private BigDecimal bigDecimal = new BigDecimal(1);
    private double quantity = 1.0;
    private double winterRate = 2.0;
    private double summerRate = 2.0;
    private double winterServiceCharge = 2.0;
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();
    private void compute(){
        double charge = 0;
        if(date.before(SUMMER_START) || date.after(SUMMER_END)){
            charge = quantity * winterRate + winterServiceCharge;
        }else{
            charge = quantity * summerRate;
        }
    }
}
