package com.java.creationalPattern.abstractFactory.farm;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 上午11:00
 */
public class NorthernGardener implements Gardener {
    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }

    public Veggie createVeggit(String name) {
        return new NorthernVeggie(name);
    }
}
