package com.java.structuralPattern.adapter;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午4:03
 */
public class MagicFinger implements BallIF {
    private double radius = 0;
    private static final double PI = 3.14D;
    private Cube adaptee;
    public MagicFinger(Cube adaptee) {
        super();
        this.adaptee = adaptee;
        radius = adaptee.getWidth();
    }

    public double calculateArea() {
        return PI * 4.0D * (radius * radius);
    }

    public double calculateVolume() {
        return PI * 4.0D / 3.0D * (radius * radius * radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        // Arrays.asList("a","b","c").forEach(e->System.out.println())
    }
}
