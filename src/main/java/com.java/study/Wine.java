package com.java.study;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 下午6:56
 */
public class Wine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wine() {

    }
    public String drink() {
        return "喝的是：" + getName();
    }
    public String toString() {
        return "asdkfjlas";
    }

    public void fun1() {
        System.out.println("Wine 的Fun one");
    }

    public void fun2() {
        System.out.println("Wine 的Fun two");
    }

}
