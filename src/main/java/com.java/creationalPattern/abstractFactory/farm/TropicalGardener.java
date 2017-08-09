package com.java.creationalPattern.abstractFactory.farm;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 上午11:02
 */
public class TropicalGardener implements Gardener {
    public Fruit createFruit(String name) {
        return new TropicalFruit(name);
    }

    public Veggie createVeggie(String name) {
        return new TropicalVeggie(name);
    }
}
