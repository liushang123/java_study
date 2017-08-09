package com.java.immutablePattern.Observer;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by mi on 17-7-26.
 */
public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observersVector = new ArrayList();

    public void attach(Observer observer) {
        observersVector.add(observer);
    }

    public void detach(Observer observer) {
        observersVector.remove(observer);
    }

    public void notifyObserver() {
        for (Observer a : observersVector) {
            a.update();
        }

    }
}
