package com.java.creationalPattern.builderPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-27 下午5:12
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    public Product retrieveResult() {
        return product;
    }

    @Override
    public void buildPart1() {

    }

    @Override
    public void buildPart2() {
    }
}
