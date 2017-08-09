package com.java.structuralPattern.flyweightPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午3:37
 */
public class FlavorFactory {
    private Order[] flavors = new Flavor[10];
    private int orderMade = 0;
    private int totalFlavors = 0;

    public Order getOrder(String flavorToGet) {
        if (orderMade > 0) {
            for (int i = 0; i < orderMade; i++) {
                if (flavorToGet.equals(flavors[i].getFlavor())) {
                    return flavors[i];
                }
            }
        }
        flavors[orderMade] = new Flavor(flavorToGet);
        totalFlavors++;
        return flavors[orderMade++];
    }
    public int getTotalFlavorsMade() {
        return totalFlavors;
    }
}
