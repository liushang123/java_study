package com.java.creationalPattern.factoryMethod.farm;

import com.java.creationalPattern.simpleFactory.Apple;
import com.java.creationalPattern.simpleFactory.Fruit;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 上午11:18
 */
public class AppleGardener implements FruitGardener {
    public Fruit factory() {
        return new Apple();
    }
}
