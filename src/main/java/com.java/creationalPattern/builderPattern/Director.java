package com.java.creationalPattern.builderPattern;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-27 下午5:07
 */
public class Director {
    private Builder builder;

    public void construct() {
        builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
    }
}
