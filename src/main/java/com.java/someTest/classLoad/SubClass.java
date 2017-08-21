package com.java.someTest.classLoad;

/**
 * Created by mi on 17-8-18.
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass");
    }
    static int a;

    public SubClass() {
        System.out.println("SubClass init");
    }
}
