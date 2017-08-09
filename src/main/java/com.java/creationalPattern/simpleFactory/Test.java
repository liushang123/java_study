package com.java.creationalPattern.simpleFactory;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-22 下午2:15
 */
public class Test {
    public static void main(String[] args) {
        Fruit f;
        try {
            f = FruitGardener.factory("grape");
            f.grow();
            f = FruitGardener.factory("apple");
            f.grow();
            /*
             * Apple aaa = (Apple)f; aaa.setTreeAge(1);
             */
            System.out.println(f.getClass().getName());

        } catch (BadFruitException e) {
            System.out.println(e);
        } catch (Exception e) {

        }
    }

}
