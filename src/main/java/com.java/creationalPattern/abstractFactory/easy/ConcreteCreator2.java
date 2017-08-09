package com.java.creationalPattern.abstractFactory.easy;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 上午10:47
 */
public class ConcreteCreator2 implements Creator {
    public ProductA factoryA() {
        return new ProductA2();
    }

    public ProductB factoryB() {
        return new ProductB2();
    }
}
