package com.java.study;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 下午7:23
 */

public class Test {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));

        Wine wine1 = new JNC();
        Wine wine2 = new JGJ();
        System.out.println(wine1.toString() + "---" + wine1.drink());
        System.out.println(wine2.toString() + "---" + wine2.drink());

        int[] array = new int[10];
        System.out.println("array 的父类是：" + array.getClass().getSuperclass());
        System.out.println("array 的类名是：" + array.getClass().getName());

        Class clazz = array.getClass();
        System.out.println(clazz.getDeclaredFields().length);
        System.out.println(clazz.getDeclaredMethods().length);

    }
}
