package com.java.someTest.aop.aop03;

import com.java.someTest.aop.aop01.Math;

/**
 * Created by mi on 17-8-21.
 */
public class TestAop03 {
    static Math math = (Math) new DynamicProxy().getProxyObject(new Math());

    public static void main(String[] args) {
        int n1 = 14, n2 = 7;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);

    }
}
