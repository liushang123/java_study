package com.java.multithreading;

/**
 * Created by mi on 17-7-13.
 */
public class T1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("代码的执行结果与代码的顺序无关");
        /*myThread.run();
        System.out.println("如果是直接执行run方法，肯定是按照代码的顺序执行的，应为是通过主线程调用的");*/

    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("创建的线程");
    }
}
