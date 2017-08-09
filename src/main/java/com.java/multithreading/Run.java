package com.java.multithreading;

/**
 * Created by mi on 17-7-13.
 */
public class Run {
    public static void main(String[] args) {
        Example example = new Example();

        Runnable runnable = new MyRunnable(example);
        Thread thread1 = new Thread(runnable);
        thread1.setPriority(10);
        thread1.start();

        Runnable runnable1 = new MyRunnable(example);
        Thread thread2 = new Thread(runnable1);
        thread2.start();

        System.out.println("运行结束！");

    }
}

