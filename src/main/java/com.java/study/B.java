package com.java.study;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 下午7:47
 */
public class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    public String show(A obj) {
        return ("B and A");
    }
}
