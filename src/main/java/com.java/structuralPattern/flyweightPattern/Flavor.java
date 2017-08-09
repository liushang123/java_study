package com.java.structuralPattern.flyweightPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午3:34
 */
public class Flavor extends Order {
    private String flavor;

    public Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getFlavor() {
        return flavor;
    }

    @Override
    public void serve() {
        System.out.println("Serving flavor " + flavor);
    }
}
