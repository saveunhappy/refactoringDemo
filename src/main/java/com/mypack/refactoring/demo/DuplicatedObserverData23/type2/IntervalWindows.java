package com.mypack.refactoring.demo.DuplicatedObserverData23.type2;

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

    public IntervalWindows()  {
        subject = new Internal();
        subject.addObserver(this);
        update(subject,null);
    }


    @Override
    public void update(Observable o, Object arg) {

    }
    //TODO
    String getEnd(){
        return endField.getText();
    }
    void setEnd(String arg){
        endField.setText(arg);
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
        if (isNotInteger(startField.getText()))
            startField.setText("0");
        calculateLength();
    }
    void EndField_FocusLost(FocusEvent event) {
        if (isNotInteger(getEnd()))
            setEnd("0");
        calculateLength();
    }
    void LengthField_FocusLost(FocusEvent event) {
        if (isNotInteger(lengthField.getText()))
            lengthField.setText("0");
        calculateEnd();
    }

     void calculateLength() {
        try {
            Integer start = Integer.valueOf(startField.getText());
            Integer end = Integer.valueOf(getEnd());
            Integer length = end - start;
            lengthField.setText(String.valueOf(length));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }
     void calculateEnd() {
        try {
            Integer start = Integer.valueOf(startField.getText());
            Integer length = Integer.valueOf(lengthField.getText());
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
