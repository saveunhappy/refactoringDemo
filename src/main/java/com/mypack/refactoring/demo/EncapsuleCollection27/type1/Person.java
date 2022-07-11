package com.mypack.refactoring.demo.EncapsuleCollection27.type1;

import java.util.Set;

public class Person {
    private Set courses;

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }
}
