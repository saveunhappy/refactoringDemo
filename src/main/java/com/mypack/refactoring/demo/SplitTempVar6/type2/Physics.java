package com.mypack.refactoring.demo.SplitTempVar6.type2;

public class Physics {
    double primaryForce = 5;
    double mass  = 1;
    int delay = 2;
    //acc被赋值了两次，第一个是力的初始加速度，第二次保存两个力共同造成的加速度
    double getDistanceTravelled(int time){
        double result;
        double acc = primaryForce / mass;
        int primaryTime  = Math.min(time,delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if(secondaryTime > 0){
            double primaryVel = acc * delay;
            acc = (primaryTime + secondaryTime) / mass;
            result += primaryVel + secondaryTime + 0.5 * acc * secondaryTime
                    * secondaryTime;

        }
        return result;

    }

    public static void main(String[] args) {
        Physics physics = new Physics();
        double distanceTravelled = physics.getDistanceTravelled(2);
        System.out.println(distanceTravelled);
    }

}
