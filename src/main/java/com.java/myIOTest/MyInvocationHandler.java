package com.java.myIOTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-28 上午10:56
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    MyInvocationHandler() {
        super();
    }

    MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("getName".equals(method.getName())) {
            System.out.println("+++++++before" + method.getName() + "+++++++");
            Object result = method.invoke(target, args);
            System.out.println("+++++++after " + method.getName() + "+++++++");
            return result;
        } else {
            Object object = method.invoke(target, args);
            return object;
        }
    }

    public static void main(String[] args) {
        UserService userService = new UserseviceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), invocationHandler);
        System.out.println(userServiceProxy.getName(1));
        System.out.println(userServiceProxy.getAge(1));

    }
}
