package com.java.creationalPattern.simpleFactory;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-22 下午1:58
 */
public class Grape implements Fruit {
    private boolean seedless;

    public void grow() {
        log("Grape is growing");
    }

    public void harvest() {
        log("Grape has been harvested");
    }

    public void plant() {
        log("Grape has been planted");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
