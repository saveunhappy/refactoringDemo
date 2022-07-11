package com.mypack.refactoring.demo.IntroduceLocalExtention17.type3Wrap;

import java.util.Date;

/**
 * 包装类，就是把原来的类给拿过来，把它原来的方法，再给写一遍，里面调用原来的类的方法，
 * 看着还行，但是有一个特殊问题，如何处理“接受原始类的实例为参数”的函数？
 * 例如public boolean after(Date date),你把原来的类拿过来了，好，原来的方法写一遍
 * 好，你可以自定义传任何对象，包装类，原始类，但是你的目的是想拓展吧，但是Date类的这个
 * 函数，只能接受Date类型，你发现到最后了，Date的函数没办法接受包装类型，然后，你就隐藏不了
 * 包装类的存在了因为系统提供的equals方法可能会出问题，你可能会想到覆写，但是，这样做很危险
 * a.equal(b)和b.equal(a)表达式表达的意思是一样的，都是为了判定a和b两个string对象是否相同
 * ，但是，前者表示a对象不能为空，否则会报错，后者表示b对象不能为空，否则报错,唯一的办法就是
 * 修改Date类，但是能修改Date类了，我还重构干啥呢？
 * 只能向用户公开，我用了包装类，然后equals就得改名equalsDate，子类就不用了，因为只会加函数
 * 不会去覆盖原来的函数(不要忘了目的，就是为了拓展Date类)
 *
 */
public class MfDateWrap {
    private Date orignal;
    public MfDateWrap(String dateString){
        orignal = new Date(dateString);
    }
    public MfDateWrap(Date arg){
        orignal = arg;
    }

    public int getYear() {
        return orignal.getYear();
    }
    public int getMonth() {
        return orignal.getMonth();
    }
    public int getDate() {
        return orignal.getDate();
    }
    public boolean after(Date when) {
        return orignal.after(when);
    }
//    public boolean after(MfDateWrap when) {
//        return orignal.after(when);
//    }

    @Override
    public boolean equals(Object arg) {
        if(this ==arg) return true;
        if(!(arg instanceof MfDateWrap)) return false;
        MfDateWrap other = (MfDateWrap)arg;
        return orignal.equals(other.orignal);
    }
    public Date nextDay(){
        return new Date(getYear(),getMonth(),getDate() + 1);
    }
}
