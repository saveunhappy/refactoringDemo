package com.mypack.refactoring.demo.EncapsuleCollection27.array3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<String> skills = new ArrayList<>();
    //TODO 现在，是时候把数组换成list了
    public String[] getSkills() {
        return skills.toArray(new String[0]);
    }

//    public void setSkills(String[] skills) {
//        this.skills = skills;
//    }
    //同样的，首先要提供一个修改函数，由于用户有可能修改数组中某一特定位置上的值。
    void setSkill(int index,String newSkill){
        skills.set(index,newSkill);
    }

    //如果需要处理从数组中移除元素，就会有些困难，如果作为参数传入的数组和原数组长度不同，情况
    //也会比较复杂，这就是优先选择集合的原因之一。
    public static void main(String[] args) {
        Person kent = new Person();
        kent.getSkills()[1] = "Refactoring";
        //改为
        kent.setSkill(1,"Refactoring");
        
    }
}
