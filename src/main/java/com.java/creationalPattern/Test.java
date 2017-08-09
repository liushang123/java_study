package com.java.creationalPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-22 上午10:44
 */
public class Test extends Yuan {
    @Override
    public long getHeight() {
        return 3;
    }

    @Override
    public void tes() {
        System.out.println("test");
    }

    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        Yuan t = new Test();
        System.out.println(t.getHeight());
        System.out.println(t.getWidth());
        t.tes();
        t.aaa();
    }
}
