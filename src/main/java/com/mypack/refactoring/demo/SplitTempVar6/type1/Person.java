package com.mypack.refactoring.demo.SplitTempVar6.type1;

public class Person {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    /**
     *当你的程序中有一个成员变量被赋值超过一次，它既不是循环变量，也不被用于收集计算结果
     * 那你就该创建另一个独立的，对应的临时变量，因为临时变量总是不安全的，
     * 如果是i  = i +某个表达式，就是收集变量，那么就不要分解它
     */
    public void compute1(){
        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }
//            | |
//            | |
//             V


    public void compute2(){
        final double temp = 2 * (height + width);
        System.out.println(temp);
        final double area = height * width;
        System.out.println(area);
    }
}
