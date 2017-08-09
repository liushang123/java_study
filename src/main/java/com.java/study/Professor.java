package com.java.study;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 上午11:14
 */
public class Professor implements Cloneable {
    String name;
    int age;

    Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}
