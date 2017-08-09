package com.java.creationalPattern.factoryMethod.farm;

import com.java.creationalPattern.simpleFactory.Fruit;
import com.java.creationalPattern.simpleFactory.Grape;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 上午11:21
 */
public class GrapeGardener implements FruitGardener {
    public Fruit factory() {
        return new Grape();
    }
}
