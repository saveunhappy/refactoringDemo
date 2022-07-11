package com.mypack.refactoring.demo.ReplaceMagicNumberWithSymboliConstant26;

public class Person {
//    double potentialEnergy(double mass,double height){
//        return mass * 9.81 * height;
//    }
//          | |
//          | |
//           V
    public static final double GRAVEITATION_CONSTANT = 9.81;
    double potentialEnergy(double mass,double height){
        return mass * GRAVEITATION_CONSTANT * height;
    }
    /*
      许多语言都允许你声明常量，常量不会造成任何的性能开销，却可以大大提高代码的可读性
     */
}
