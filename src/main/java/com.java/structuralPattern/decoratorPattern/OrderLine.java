package com.java.structuralPattern.decoratorPattern;

import java.text.NumberFormat;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 下午1:38
 */
public class OrderLine {
    private String itemName;
    private int units;
    private double unitPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void printLine() {
        System.out.println(itemName + "\t\t" + units + "\t\t" + formatCurrency(unitPrice) + "\t\t" + formatCurrency(getSubtotal()));
    }

    public double getSubtotal() {
        return unitPrice * units;
    }

    private String formatCurrency(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }
}
