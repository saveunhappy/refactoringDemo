package com.mypack.refactoring.demo.EncapsuleCollection27.type1;

public class Course {
    public Course(String name, boolean advanced) {
        this.name = name;
        this.advanced = advanced;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    private String name;
    private boolean advanced;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdvanced(boolean advanced) {
        this.advanced = advanced;
    }
}
