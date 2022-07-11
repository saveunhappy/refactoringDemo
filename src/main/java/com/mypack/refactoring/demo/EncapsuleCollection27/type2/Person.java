package com.mypack.refactoring.demo.EncapsuleCollection27.type2;

import org.junit.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
    // TODO
    private Set courses = new HashSet();

    public Set getCourses() {
        return Collections.unmodifiableSet(courses);
    }
    //在函数内部调用，之后就可以去掉了
    public void InitializeCourses(Set courses) {
        Assert.assertTrue(courses.isEmpty());
        Iterator iterator = courses.iterator();
        while (iterator.hasNext()){
            addCourse((Course)iterator.next());
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
}
