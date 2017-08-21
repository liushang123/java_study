package com.java.someTest.classLoad;

/**
 * Created by mi on 17-8-18.
 */
public class SuperClass extends SSClass {
    static {
        System.out.println("SuperClass");
    }
    public static int value = 123;

    public SuperClass() {
        System.out.println("SuperClass init");
    }
}
