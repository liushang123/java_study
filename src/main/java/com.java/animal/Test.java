package com.java.animal;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-13 上午9:55
 */
public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.cry();
        a2.cry();

        long start_01 = System.currentTimeMillis();
        String a = "a";
        for (int i = 0; i < 10000; i++) {
            a += "b";
        }
        long end_01 = System.currentTimeMillis();
        System.out.println("   + 所消耗的时间： " + (end_01 - start_01) + "  毫秒");

        long start_02 = System.currentTimeMillis();
        String c = "c";
        for (int i = 0; i < 10000; i++) {
            c = c.concat("d");
        }
        long end_02 = System.currentTimeMillis();
        System.out.println("   + 所消耗的时间： " + (end_02 - start_02) + "  毫秒");

        long start_03 = System.currentTimeMillis();
        StringBuffer e = new StringBuffer("e");
        for (int i = 0; i < 10000; i++) {
            e = e.append("f");
        }
        long end_03 = System.currentTimeMillis();
        System.out.println("   + 所消耗的时间： " + (end_03 - start_03) + "  毫秒");

        long start_04 = System.currentTimeMillis();
        StringBuilder g = new StringBuilder("g");
        for (int i = 0; i < 10000; i++) {
            g = g.append("h");
        }
        long end_04 = System.currentTimeMillis();
        System.out.println("   + 所消耗的时间： " + (end_04 - start_04) + "  毫秒");

    }
}
