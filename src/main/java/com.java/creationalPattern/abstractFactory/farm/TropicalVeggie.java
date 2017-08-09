package com.java.creationalPattern.abstractFactory.farm;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 上午11:06
 */
public class TropicalVeggie implements Veggie {
    private String name;

    public TropicalVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
