package com.mypack.refactoring.demo.EncapsuleCollection27.type3;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
    private Set courses = new HashSet();

    public Set getCourses() {
        return courses;
    }
    //TODO 如果我知道初始化时，除了添加元素，不会再有其他行为，那么我可以不使用循环，直接调用addAll()函数
    public void InitializeCourses(Set courses) {
        Assert.assertTrue(courses.isEmpty());
        courses.addAll(courses);
    }


    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
}
