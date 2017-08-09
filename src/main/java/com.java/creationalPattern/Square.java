package com.java.creationalPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-21 下午5:49
 */
public class Square implements Quadrangle {
    private long side;

    public long getSide() {
        return side;
    }

    public void setSide(long side) {
        this.side = side;
    }

    public long getWidth() {
        return getSide();
    }

    public long getHeight() {
        return getSide();
    }

    public void aaa() {

    }
}
