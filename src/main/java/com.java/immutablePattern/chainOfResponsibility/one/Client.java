package com.java.immutablePattern.chainOfResponsibility.one;

/**
 * Created by mi on 17-7-26.
 */
public class Client {
    public static Handler handler1,handler2;

    public static void main(String[] args) {
        handler1 = new ConcreteHandler();
        handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
