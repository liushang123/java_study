package com.java.structuralPattern.adapter;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午4:00
 */
public interface BallIF {
    /**
     * 计算面积
     */
    public double calculateArea();

    /**
     * 计算体积
     */
    public double calculateVolume();

    /**
     * 半径赋值
     */
    public void setRadius(double radius);
}
