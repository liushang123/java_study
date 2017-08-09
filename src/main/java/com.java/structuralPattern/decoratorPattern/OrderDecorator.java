package com.java.structuralPattern.decoratorPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 下午2:06
 */
public class OrderDecorator extends Order {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
        this.setSalesDate(order.getSalesDate());
        this.setCustomerName(order.getCustomerName());
    }

    public void print() {
        super.print();
    }
}
