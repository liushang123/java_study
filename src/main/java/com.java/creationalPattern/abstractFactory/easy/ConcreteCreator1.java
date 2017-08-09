package com.java.creationalPattern.abstractFactory.easy;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 上午10:45
 */
public class ConcreteCreator1 implements Creator {
    public ProductA factoryA() {
        return new ProductA1();
    }

    public ProductB factoryB() {
        return new ProductB1();
    }
}
