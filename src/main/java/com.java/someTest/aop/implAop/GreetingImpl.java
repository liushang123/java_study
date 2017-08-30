package com.java.someTest.aop.implAop;

/**
 * Created by mi on 17-8-21.
 */
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello:" + name);
    }
}
