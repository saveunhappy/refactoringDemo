package com.mypack.refactoring.demo.EncapsuleCollection27.type3;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    /*
    1.就是说一个类里面有一个集合，要添加另一个对象，但是你要添加的话，还是得通过get方法获取到那个set
    再调用里面的方法，这样太麻烦了，先创建一个set，把数据都塞进这个set，再设置给第一个类，那我为什么
    不在第一个类里面直接初始化好呢？
    2.初始化好了之后，开始重构，add和remove方法，里面调用的还是那个类里面的set的里面的remove和add方法
    但是这样就见名知意了，然后我就不应该让你访问我那个set了，我就应该只返回一个副本，不能让你随意访问
    我的内部，只给你返回一个副本。
    public Set getCourses() {
        return Collections.unmodifiableSet(courses);
    }
     */
    public static void main(String[] args) {
        Person kent = new Person();
        Set s = new HashSet();
      //  s.add(new Course("small progamming",false));
      //  s.add(new Course("Appreciating single lts",true));
        kent.addCourse(new Course("small progamming",false));
        kent.addCourse(new Course("Appreciating single lts",true));
        Assert.assertEquals(2,kent.getCourses().size());
        Course refact = new Course("Refactorying",true);
       // kent.getCourses().add(refact);
       // kent.getCourses().add(new Course("Brutal Sarascam",false));
        kent.addCourse(refact);
        kent.addCourse(new Course("Brutal Sarascam",false));
        Assert.assertEquals(4,kent.getCourses().size());
        kent.removeCourse(refact);
        Assert.assertEquals(3,kent.getCourses().size());
        //如果想了解高级课程还能这么做
        //先提炼成一个方法，然后移动到Person类中去
        numberOfAdvancedCourse(kent);


    }

    private static int numberOfAdvancedCourse(Person kent) {
        Iterator iter = kent.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()){
            Course each = (Course)iter.next();
            if(each.isAdvanced())count++;
            System.out.println(each);
        }
        return count;
    }
}
