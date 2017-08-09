package com.java.structuralPattern.flyweightPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午3:03
 */
public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;

    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    public void operation(String state) {
        System.out.println("\nIntrinsic State = " + intrinsicState + ",Extrinsic State = " + state);
    }
}
