package com.java.creationalPattern.builderPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-27 下午5:08
 */
abstract public class Builder {
    /**
     * 产品零件建造方法
     */
    public abstract void buildPart1();
    /**
     * 产品零件建造方法
     */
    public abstract void buildPart2();
    /**
     * 产品返还方法
     */
    public abstract Product retrieveResult();
}
