package com.mypack.refactoring.demo.DuplicatedObserverData23.type3;

import java.util.Observable;

public class Internal extends Observable {
    private String end = "0";

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }
}
