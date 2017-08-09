package com.java.structuralPattern.decoratorPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 下午2:09
 */
public class HeaderDecorator extends OrderDecorator {
    public HeaderDecorator(Order anOrder) {
        super(anOrder);
    }

    public void print() {
        this.printHeader();
        super.order.print();
    }

    private void printHeader() {
        System.out.println("\t***\tI N V O I C E\t***");
        System.out.println("XYZ Incorporated\nDate of Sale");
        System.out.println(order.getSalesDate());
        System.out.println("=================================");
        System.out.println("Item\t\t\t\tUnit\t Price\t\tSubtotal");
    }
}
