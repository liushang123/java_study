package com.java.creationalPattern.simpleFactory;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-22 下午2:07
 */
public class FruitGardener {
    public static Fruit factory(String which) throws BadFruitException {
        if (which.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (which.equalsIgnoreCase("strawberry")) {
            return new Strawberry();
        } else if (which.equalsIgnoreCase("grape")) {
            return new Grape();
        } else {
            throw new BadFruitException(which + " is Bad fruit request");
        }
    }
}
