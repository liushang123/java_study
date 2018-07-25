package com.java.someTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class lockTry {
    Lock lock = new ReentrantLock();

    public void func() {
        lock.lock();
        func2();
        lock.unlock();
    }

    public synchronized void func2() {
        lock.lock();
        System.out.println("1111");
        lock.unlock();
    }

    public static void main(String[] args) {
        lockTry lo = new lockTry();
        lo.func();
        System.out.println(22);
    }
}
