package com.mypack.refactoring.demo.DuplicatedObserverData23.type4;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindows extends Frame implements Observer {
    private Internal subject;
    TextField startField;
    TextField endField;
    TextField lengthField;

    public IntervalWindows(String title) throws HeadlessException {

        super(title);
        subject = new Internal();
        subject.addObserver(this);
        update(subject,null);
    }

    public IntervalWindows()  {
        subject = new Internal();
        subject.addObserver(this);
        update(subject,null);
    }


    @Override
    public void update(Observable o, Object arg) {
        endField.setText(subject.getEnd());
    }

    String getEnd(){
        return subject.getEnd();
    }
    void setEnd(String arg){
        subject.setEnd(arg);
    }
    String getStart(){
        return subject.getStart();
    }
    void setStart(String arg){
        subject.setStart(arg);
    }
    String getLength(){
        return subject.getLength();
    }
    void setLength(String arg){
        subject.setLength(arg);
    }
    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent event) {
            Object object = event.getSource();
            if (object == startField)StartField_FocusLost(event);
            if (object == endField)EndField_FocusLost(event);
            if (object == lengthField)LengthField_FocusLost(event);
        }
    }

    void StartField_FocusLost(FocusEvent event) {
        setEnd(subject.getEnd());
        if (isNotInteger(getStart()))
            setStart("0");
        calculateLength();
    }
    void EndField_FocusLost(FocusEvent event) {
        if (isNotInteger(getEnd()))
            setEnd("0");
        calculateLength();
    }
    void LengthField_FocusLost(FocusEvent event) {
        if (isNotInteger(getLength()))
            setLength("0");
        calculateEnd();
    }

     void calculateLength() {
        try {
            Integer start = Integer.valueOf(getStart());
            Integer end = Integer.valueOf(getEnd());
            Integer length = end - start;
            setLength(String.valueOf(length));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }
     void calculateEnd() {
        try {
            Integer start = Integer.valueOf(getStart());
            Integer length = Integer.valueOf(getLength());
            Integer end = start + length;
            setEnd(String.valueOf(end));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }

    private boolean isNotInteger(String text) {
        return true;
    }

}
