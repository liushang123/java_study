package com.java.creationalPattern.simpleFactory;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-22 下午1:53
 */
public class Apple implements Fruit {
    private int treeAge;

    public void grow() {
        log("Apple is growing");
    }

    public void harvest() {
        log("Apple has been harvested");
    }

    public void plant() {
        log("Apple has been planted");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
