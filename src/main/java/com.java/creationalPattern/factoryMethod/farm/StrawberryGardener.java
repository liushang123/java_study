package com.java.creationalPattern.factoryMethod.farm;

import com.java.creationalPattern.simpleFactory.Fruit;
import com.java.creationalPattern.simpleFactory.Strawberry;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 上午11:22
 */
public class StrawberryGardener implements FruitGardener {
    public Fruit factory() {
        return new Strawberry();
    }
}
