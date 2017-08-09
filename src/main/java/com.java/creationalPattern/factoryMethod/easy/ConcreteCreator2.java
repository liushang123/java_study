package com.java.creationalPattern.factoryMethod.easy;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 上午10:31
 */
public class ConcreteCreator2 implements Creator {
    public Product factory() {
        return new ConcreteProduct2();
    }
}
