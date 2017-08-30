package com.java.someTest.aop.aop04;

import com.java.someTest.aop.aop01.IMath;
import com.java.someTest.aop.aop01.Math;

import org.springframework.aop.framework.ProxyFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mi on 17-8-21.
 */
public class TestAop04 {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(); // 实例化spring代理工厂

        factory.setTarget(new Math());

        factory.addAdvice(new BeforeAdvice());
        factory.addAdvice(new AfterAdvice());
        factory.addAdvice(new SurroundAdvice());

        IMath math = (IMath) factory.getProxy();

        int a = 200, b = 50;

        math.add(a, b);

        List<Integer> list = new ArrayList<>();

        list.add(111);

        int l = list.get(0);
    }
}
