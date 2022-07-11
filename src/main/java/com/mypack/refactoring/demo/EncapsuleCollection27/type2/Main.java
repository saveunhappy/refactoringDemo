package com.mypack.refactoring.demo.EncapsuleCollection27.type2;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person kent = new Person();
        Set s = new HashSet();
        s.add(new Course("small progamming",false));
        s.add(new Course("Appreciating single lts",true));
   //     kent.setCourses(s);
        Assert.assertEquals(2,kent.getCourses().size());
        Course refact = new Course("Refactorying",true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course("Brutal Sarascam",false));
        Assert.assertEquals(4,kent.getCourses().size());
        kent.getCourses().remove(refact);
        Assert.assertEquals(3,kent.getCourses().size());
        //如果想了解高级课程还能这么做
        Iterator iter = kent.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()){
            Course each = (Course)iter.next();
            if(each.isAdvanced())count++;
        }


    }
}
