package com.java.creationalPattern.singletonPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 下午2:27
 */
public class RegSingletonChild extends RegSingleton {
    public RegSingletonChild() {

    }

    public static RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton.getInstance("com.java.patterns.singletonPattern.RegSingletonChild");
    }
}
