package com.java.someTest.aop.aop02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Created by mi on 17-8-21.
 */
public class DynamicProxy implements InvocationHandler {

    // 被代理的对象
    Object targetObject;

    /**
     * 获得被代理后的对象
     * 
     * @param object
     *            object被代理的对象
     * @return 代理后的对象
     */
    public Object getProxyObject(Object object) {
        this.targetObject = object;
        // loader：一个ClassLoader对象，定义了由哪个ClassLoader对象来生成代理对象进行加载
        // interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，
        // 如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
        // h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，
        // 会关联到哪一个InvocationHandler对象上，间接通过invoke来执行
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);// InvocationHandler对象

    }

    /**
     * 当用户调用对象中的每个方法时都通过下面的方法执行，方法必须在接口
     * 
     * @param proxy
     *            被代理后的对象
     * @param method
     *            将要被执行的方法信息（反射）
     * @param args
     *            执行方法时需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        lazy();

        Object result = method.invoke(targetObject, args);

        Long span = System.currentTimeMillis() - start;

        System.out.println("共用时: " + span);
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
