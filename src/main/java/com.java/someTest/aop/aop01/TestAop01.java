package com.java.someTest.aop.aop01;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mi on 17-8-21.
 */
public class TestAop01 {
    static IMath math = new MathProxy();

    public static void main(String[] args) {
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
        List<String> li = new ArrayList<>();
        li.add("a");
        li.add("b");
        li.add("c");
        String str1 = li.get(1);
        li.remove(0);
        String str2 = li.get(0);
        int a = 1;
        WeakReference<String> str = new WeakReference<String>(new String("hello"));
        System.out.println(str.get());
        System.gc();
        System.out.println(str.get());
    }
}
