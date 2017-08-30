package com.java.someTest.aop.aop02;

import com.java.someTest.aop.aop01.IMath;
import com.java.someTest.aop.aop01.Math;

/**
 * Created by mi on 17-8-21.
 */
public class TestAop02 {
    static IMath math = (IMath) new DynamicProxy().getProxyObject(new Math());

    public static void main(String[] args) {
        int n1 = 100, n2 = 50;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
