package com.java.creationalPattern.factoryMethod.farm;

import com.java.creationalPattern.simpleFactory.Fruit;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 下午4:19
 */
public class Test {
    public static void main(String[] args) {
        Fruit fa, fg, fs;
        FruitGardener g, a, s;
        try {
            g = new GrapeGardener();
            a = new AppleGardener();
            s = new StrawberryGardener();
            fg = g.factory();
            fg.harvest();
            fa = a.factory();
            fa.plant();
            fs = s.factory();
            fs.grow();

        } catch (Exception e) {

        }
    }
}
