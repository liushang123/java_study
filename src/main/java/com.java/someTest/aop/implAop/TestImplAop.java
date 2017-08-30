package com.java.someTest.aop.implAop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by mi on 17-8-21.
 */
public class TestImplAop {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());

        proxyFactory.addAdvice(new GreatingAroundAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("Jack");
    }
}
