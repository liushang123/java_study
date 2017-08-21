package com.java.someTest.classLoad;

/**
 * Created by mi on 17-8-18.
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
        SubClass s = new SubClass();
        SubClass s2 = new SubClass();
    }
}
