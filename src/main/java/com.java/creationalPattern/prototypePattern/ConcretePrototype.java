package com.java.creationalPattern.prototypePattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午1:22
 */
public class ConcretePrototype implements Prototype {
    public synchronized Object clone() {
        Prototype temp = null;
        try {
            temp = (Prototype) super.clone();
            return temp;
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed");
        } finally {
            return temp;
        }
    }

}
