package com.java.immutablePattern.Observer;

/**
 * Created by mi on 17-7-27.
 */
public class ObserverClient {
    public static void main(String[] args) {
        Observer ob = new ConcreteObserver();
        Subject su = new ConcreteSubject();
        su.attach(ob);
        su.notifyObserver();
    }
}
