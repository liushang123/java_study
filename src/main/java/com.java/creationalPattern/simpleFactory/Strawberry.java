package com.java.creationalPattern.simpleFactory;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-22 下午2:03
 */
public class Strawberry implements Fruit {
    public void grow() {
        log("Strawberry id growing");
    }

    public void harvest() {
        log("Strawberry has been harvested");
    }

    public void plant() {
        log("Strawberry has been planted");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }
}
