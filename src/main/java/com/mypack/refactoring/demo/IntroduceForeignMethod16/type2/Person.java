package com.mypack.refactoring.demo.IntroduceForeignMethod16.type2;

import java.util.Date;

public class Person {
    /*
        这种事情发生过太多次了：你正在使用一个类，它真的很好，为你提供了需要的所有服务
        而后，你又需要一项新服务，，这个类无法供应，于是你开始咒骂，为什么不能做这件事？
        如果可以修改源代码，你便可以自行添加一个新函数：如果不能，你就得在客户端编码，补足你
        要的那个函数。
        如果客户类只使用这项功能一次，那么额外编码工作没什么大不了，甚至根本不需要原本提供
        服务的那个类，如果多次用到，就得不断重复，重复代码是万恶之源，这些代码就该被抽取出来
        如果你发现自己为一个类建立了大量外加函数，或者发现有许多类都需要同样的外加函数，就不应该
        使用本项重构，而应该使用Introduce Local Extention
     */
    public static void main(String[] args) {
        Date previousEnd = new Date();
        Date newStart = nextDay(previousEnd);


    }
    private static Date nextDay(Date date){
        return new Date(date.getYear(),date.getMonth(),date.getDate() + 1);
    }
}
