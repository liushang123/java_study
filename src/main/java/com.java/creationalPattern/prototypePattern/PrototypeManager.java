package com.java.creationalPattern.prototypePattern;

import java.util.Vector;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午1:39
 */
public class PrototypeManager {
    private Vector objects = new Vector();

    public void add(Prototype obj) {
        objects.add(obj);
    }

    public Prototype get(int i) {
        return (Prototype) objects.get(i);
    }

    public int getSize() {
        return objects.size();
    }
}
