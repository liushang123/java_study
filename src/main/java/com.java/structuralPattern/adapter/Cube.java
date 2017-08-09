package com.java.structuralPattern.adapter;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午3:57
 */
public class Cube {
    private double width;

    public Cube(double width) {
        this.width = width;
    }

    /**
     * 计算体积
     * 
     * @return
     */
    public double calculateVolume() {
        return width * width * width;
    }

    /**
     * 计算面积
     * 
     * @return
     */
    public double calculateFaceArea() {
        return width * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
