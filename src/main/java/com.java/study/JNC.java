package com.java.study;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 下午6:58
 */
public class JNC extends Wine {
    public JNC() {
        setName("JNC");
    }

    public String drink() {
        return "喝的是" + getName();
    }
    public String toString() {
        return "Wine: " + getName();
    }

    public void fun1(String a) {
        System.out.println("JNC Fun 1");
        fun2();
    }
    public void fun2() {
        System.out.println("JNC Fun 2");
    }
    public void fun3() {
        System.out.println("JNC Fun 3");
    }

    public static void main(String[] args) {
        Wine a = new JNC();
        a.fun1();
        a.fun2();
        // a.fun3(); 错误
    }
}
