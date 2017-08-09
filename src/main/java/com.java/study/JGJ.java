package com.java.study;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 下午7:22
 */
public class JGJ extends Wine {
    public JGJ() {
        setName("JGJ");
    }

    public String drink() {
        return "喝的是" + getName();
    }

    public String toString() {
        return "Wine: " + getName();
    }
}
