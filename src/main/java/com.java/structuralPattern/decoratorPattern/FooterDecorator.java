package com.java.structuralPattern.decoratorPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 下午2:15
 */
public class FooterDecorator extends OrderDecorator {
    public FooterDecorator(Order anOrder) {
        super(anOrder);
    }
    public void print() {
        super.order.print();
        printFooter();
    }

    private void printFooter() {
        System.out.println("====================");
        System.out.println("Total\t\t\t" + formatCurrency(super.order.getGrandTotal()));
    }
}
