package com.java.someTest.classLoad;

/**
 * Created by mi on 17-8-18.
 */
public class SSClass {
    static {
        System.out.println("SSClass");
    }

    public SSClass() {
        System.out.println("SSClass init");
    }

}
