package com.java.immutablePattern.Observer;

/**
 * Created by mi on 17-7-26.
 */
public class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("I am notified");
        this.te();
    }

    public void te() {
        System.out.print("sdfkjksdf");
    }
}
