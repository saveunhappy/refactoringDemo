package com.mypack.refactoring.demo.DuplicatedObserverData23.type4;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        IntervalWindows windows = new IntervalWindows("cc");
        windows.setLength("10");
        windows.setStart("1");
        windows.setEnd("5");
        windows.setBackground(Color.CYAN);
        windows.setSize(500,400);
        windows.setLocation(300,200);
        windows.setVisible(true);
    }
}
