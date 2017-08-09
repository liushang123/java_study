package com.java.creationalPattern.factoryMethod.easy;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-23 上午10:35
 */
public class Client {
    private static Creator creator1, creator2;
    private static Product product1, product2;

    public static void main(String[] args) {
        creator1 = new ConcreteCreator1();
        product1 = creator1.factory();
        product1.te();
        creator2 = new ConcreteCreator2();
        product2 = creator2.factory();
    }
}
