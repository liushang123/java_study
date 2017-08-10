package com.java.multithreading;

/**
 * Created by mi on 17-8-10.
 */
public class StringTest {
    static volatile String str = "ab";
    static volatile int a = 0;

    public static void increment() {
        a++;
    }

    public static void test() {
//        a=0;
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    increment();
                    str = str + "cd";
                }
            }).start();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable() {
            private int count;
            @Override
            public void run() {
                while (count < 100) {
                    System.out.println("count = " + count);
                    count++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            private int i;

            @Override
            public void run() {
                while (i < 100) {
                    System.out.println("i = " + i);
                    i++;
                }
            }
        });

        t1.start();
        t1.join();
        t2.start();
//        t2.join();
        /*for(int i=0;i<100;i++) {
            test();
//            while (Thread.activeCount() > 2) {
//                Thread.yield();
//            }
            System.out.println(str.length());
        }*/

    }
}
