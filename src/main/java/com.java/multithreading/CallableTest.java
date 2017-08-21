package com.java.multithreading;



import java.util.concurrent.*;

/**
 * Created by mi on 17-7-17.
 */
public class CallableTest {

    public static void main(String[] args) throws Exception{
        ExecutorService e = Executors.newFixedThreadPool(2);
        Future f1 = e.submit(new MyCallableA());
        Future f2 = e.submit(new MyCallableA());
        Future f3 = e.submit(new MyCallableA());

        MyCallableA myCallableA = new MyCallableA();
        FutureTask<String> task = new FutureTask<String>(myCallableA);
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("--Future.get()....");
        try {
            System.out.println("Th:"+task.get());
            System.out.println(Thread.currentThread().getName()+"  "+f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } catch (ExecutionException e1) {
            e1.printStackTrace();
        }

        e.shutdown();
    }
}

class MyCallableA implements Callable<String> {
    public String call() throws Exception{
        System.out.println("开始执行Callable");
        String[] ss = {"zhangsan", "lisi"};
        long[] num = new long[2];
        for(int i=0;i<100000;i++) {
            num[(int)(Math.random()*2)]++;
        }
        System.out.println(Thread.currentThread().getName());
        if (num[0] > num[1]) {
            return ss[0];
        } else {
            return ss[1];
        }
    }
}
