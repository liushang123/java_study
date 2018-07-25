package com.java.someTest.zhaohangxinyongka;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        childClass.fun();

        System.out.println("  ");

    }

}

class superClass{
    static {
        System.out.println("Super");
    }
    public static void fun(){
        System.out.println("Super static fun");
    }
    public superClass(){
        System.out.println("super init");
    }
}
class childClass extends superClass{
    static {
        System.out.println("child");
    }
    public static void fun(){
        System.out.println("child static fun");
    }
    public childClass(){
        System.out.println("child init");
    }
}
