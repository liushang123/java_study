package com.java.thinkInJava.c20;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskwithResult implements Callable<String> {
    private int id;

    public TaskwithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        return "result : " + id;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            results.add(exec.submit(new TaskwithResult(i)));
        }
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (Exception e) {

            } finally {
                exec.shutdown();
            }
        }
    }
}
