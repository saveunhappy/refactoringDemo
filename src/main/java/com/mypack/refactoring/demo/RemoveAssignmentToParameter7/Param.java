package com.mypack.refactoring.demo.RemoveAssignmentToParameter7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Param {
    /*
    从本质上说，对象的引用是按值传递的，因此我可以修改参数对象的内部状态，但是对参数重新赋值是没有意义的。
     */
    public static void main(String[] args) {
        Calendar calendar = getCalendar();
        Date date = calendar.getTime();
        nextDateUpdate(date);
        System.out.println("date1 after nextDay :"+getSimpleDateFormat().format(date));
        Date date2 = new Date();
        nextDateReplace(date2);
        System.out.println("date2 after nextDay :"+getSimpleDateFormat().format(date2));
    }
    public static void nextDateUpdate(Date date){
        date.setDate(date.getDate() + 1);
        Calendar calendar = getCalendar();
        calendar.setTime(date);
        System.out.println("arg in nextDay :" + getSimpleDateFormat().format(calendar.getTime()));
    }
    public static void nextDateReplace(Date date){
        Date date2 = new Date(date.getYear(),date.getMonth(),date.getDate() +1);
        Calendar calendar = getCalendar();
  //      calendar.set(date.getYear(),date.getMonth(),date.getDate() +1);
    //    calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH+1));
        getCalendar().setTime(date2);
        // date = new Date(date.getYear(),date.getMonth(),date.getDate() + 1);
        System.out.println("arg in nextDay1 :"+getSimpleDateFormat().format(calendar.getTime()));
    }
    public static SimpleDateFormat getSimpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    }
    public static Calendar getCalendar(){
        return  Calendar.getInstance();
    }
    /**
     arg in nextDay :     2021-03-22 10:47:44
     date1 after nextDay :2021-03-22 10:47:44
     arg in nextDay1 :    2021-03-21 10:47:44
     date2 after nextDay :2021-03-21 10:47:44
     */


}
