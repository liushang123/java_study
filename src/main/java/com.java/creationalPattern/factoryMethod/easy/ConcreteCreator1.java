package com.java.creationalPattern.factoryMethod.easy;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 上午10:29
 */
public class ConcreteCreator1 implements Creator {
    public Product factory() {
        return new ConcreteProduct1();
    }
}
