package com.java.multithreading;

/**
 * Created by mi on 17-7-17.
 */
public class NumberTest {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        Thread t1 = new IncreseThread(numberHolder);
        Thread t2 = new DecreaseThread(numberHolder);

        Thread t3 = new IncreseThread(numberHolder);
        Thread t4 = new DecreaseThread(numberHolder);

        t1.start();
        t2.start();

        //t3.start();
        t4.start();

        IncreateRunnamble ru = new IncreateRunnamble(numberHolder);
        Thread thread = new Thread(ru);
        thread.start();

    }
}

class NumberHolder {
    private int number;

    public synchronized void increase() {
        while (0 != number) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println("increase: "+number);
        notify();
    }

    public synchronized void decrease() {
        while (0 == number) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println("decrease: "+number);
        notify();
    }
}

class IncreseThread extends Thread {
    private NumberHolder numberHolder;

    public IncreseThread(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    public void run() {
        for (int i=0;i<20;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                numberHolder.increase();
            }
            numberHolder.increase();
        }
    }
}

class DecreaseThread extends Thread {
    private NumberHolder numberHolder;

    public DecreaseThread(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    public void run() {
        for(int i=0;i<20;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberHolder.decrease();
        }

    }
}

class IncreateRunnamble implements Runnable {
    private NumberHolder numberHolder;

    public IncreateRunnamble(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    public void run() {
        for(int i=0;i<20;i++) {
            try {
                Thread.sleep((long)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberHolder.increase();
        }
    }
}
