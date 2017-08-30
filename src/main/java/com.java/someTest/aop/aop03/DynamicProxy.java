package com.java.someTest.aop.aop03;

import java.lang.reflect.Method;
import java.util.Random;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by mi on 17-8-21.
 */

// 动态生成一个新的类，使用弗雷的无参构造方法创建一个指定了特定回调的代理实例
public class DynamicProxy implements MethodInterceptor {
    // 被代理对象
    Object targetObject;

    public Object getProxyObject(Object object) {
        this.targetObject = object;
        // 增强器，动态代码生成器
        Enhancer enhancer = new Enhancer();
        // 回调方法
        enhancer.setCallback(this);
        // 设置生成类的父类类型
        enhancer.setSuperclass(targetObject.getClass());
        // 动态生成字节码并返回代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        lazy();
        Object result = methodProxy.invoke(targetObject, args);
        Long span = System.currentTimeMillis() - start;
        System.out.println("共用时：： " + span);
        return result;
    }

    public void lazy() {
        try {
            int n = (int) new Random().nextInt(500);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
