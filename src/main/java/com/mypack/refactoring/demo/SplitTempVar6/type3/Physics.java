package com.mypack.refactoring.demo.SplitTempVar6.type3;

public class Physics {
    double primaryForce = 5;
    double mass = 1;
    int delay = 2;
    /**
     *    acc被赋值了两次，第一个是力的初始加速度，第二次保存两个力共同造成的加速度
     *    首先，修改这个临时变量的名称，并且变成final的，接着，把第二次赋值之前的
     *    都指向新的临时变量，最后，第二次赋值处重新声明acc变量
     */

    double getDistanceTravelled(int time){
        double result;
        double primaryAcc = primaryForce / mass;
        int primaryTime  = Math.min(time,delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if(secondaryTime > 0){
            double primaryVel = primaryAcc * delay;
            double acc = (primaryTime + secondaryTime) / mass;
            result += primaryVel + secondaryTime + 0.5 * acc * secondaryTime
                    * secondaryTime;

        }
        return result;

    }
//                 | |
//                 | |
//                  V

    /**
     * 然后把原来的临时变量完全删掉，用一个新的变量取而代之，只负责承担原先acc变量的第二个责任
     * @param time
     * @return
     */
    double getDistanceTravelledTwo(int time){
        double result;
        double primaryAcc = primaryForce / mass;
        int primaryTime  = Math.min(time,delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if(secondaryTime > 0){
            double primaryVel = primaryAcc * delay;
            final double secondaryAcc = (primaryTime + secondaryTime) / mass;
            result += primaryVel + secondaryTime + 0.5 * secondaryAcc * secondaryTime
                    * secondaryTime;

        }
        return result;

    }

    public static void main(String[] args) {
        Physics physics = new Physics();
        double distanceTravelled = physics.getDistanceTravelled(2);
        double distanceTravelled2 = physics.getDistanceTravelledTwo(2);
        System.out.println(distanceTravelled == distanceTravelled2);
    }

}
