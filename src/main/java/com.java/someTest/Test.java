package com.java.someTest;

public class Test {
    public static void main(String[] args) {
        new A();
    }
}
class B{
    static {
        System.out.println("static B");
    }
    {
        System.out.println("B");
    }

    public B() {
        System.out.println("create B");
    }
}
class A extends B{
    static {
        System.out.println("static A");
    }
    {
        System.out.println("A");
    }

    public A() {
        System.out.println("create A");
    }
}
