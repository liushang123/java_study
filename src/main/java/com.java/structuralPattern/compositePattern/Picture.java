package com.java.structuralPattern.compositePattern;

import java.util.Vector;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 上午11:28
 */
public class Picture extends Graphics {
    private Vector list = new Vector(10);

    @Override
    public void draw() {
        for (int i = 0; i < list.size(); i++) {
            Graphics g = (Graphics) list.get(i);
            g.draw();
        }
    }

    public void add(Graphics graphics) {
        list.add(graphics);
    }
    public void remove(Graphics g) {
        list.remove(g);
    }

    public Graphics getChild(int i) {
        return (Graphics) list.get(i);
    }
}
