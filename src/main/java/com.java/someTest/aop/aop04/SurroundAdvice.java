package com.java.someTest.aop.aop04;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by mi on 17-8-21.
 */
public class SurroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation i) throws Throwable {
        System.out.println("方法" + i.getMethod() + " 被调用在对象" + i.getThis() + "上，参数 " + i.getArguments());
        Object ret = i.proceed();
        System.out.println("fanhuizhi::: " + ret);
        return ret;
    }
}
