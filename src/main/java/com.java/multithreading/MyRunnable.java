package com.java.multithreading;

/**
 * Created by mi on 17-7-13.
 */
public class MyRunnable implements Runnable {
    private Example example;

    public MyRunnable(Example example) {
        this.example = example;
    }

    public void run() {
        example.execute();
    }
}

class Example{
    public void execute() {
        for (int i=0;i<10;i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Hello: " + i);
        }
    }
}

