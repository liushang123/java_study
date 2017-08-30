package com.java.someTest.lock;

/**
 * Created by mi on 17-8-29.
 */
public class WaitNotify {
    public static void main(String[] args) {
        final byte a[] = {0};
        new Thread(new NumberPrint(1, a), "1").start();
        new Thread(new NumberPrint(2, a), "2").start();
    }
}

class NumberPrint implements Runnable {
    private int number;
    public byte res[];
    public static int count = 5;

    public NumberPrint(int number, byte a[]) {
        this.number = number;
        this.res = a;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (count > 0) {
                try {
                    res.notify();
                    System.out.println(" " + number);
                    res.wait();
                    System.out.println("-----线程" + Thread.currentThread().getName() + "获得锁，wait()后的代码继续运行行：" + number);
                    count--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
