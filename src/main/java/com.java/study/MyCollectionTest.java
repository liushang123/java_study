package com.java.study;

import java.util.*;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-14 下午1:58
 */
public class MyCollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);

        System.out.println(" " + a.size());
        Integer str = a.get(0);

        System.out.println(str);

        LinkedList<Integer> b = new LinkedList<Integer>();
        Vector<Integer> vector = new Vector<Integer>();
        Integer[] ct = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 9; i++) {
            vector.add(i, i);
        }

        vector.add(1);
        // vector.add(1, 2);
        System.out.println("the size of vector:" + vector.size());
        System.out.println("the capacity of vector:" + vector.capacity());
        System.out.println("the second element of the vector:" + vector.get(8));
        List i = new ArrayList();
        i.add("a");
        i.add("b");
        i.add("c");
        Iterator iter = i.iterator();
        while (iter.hasNext()) {
            String st = (String) iter.next();
            System.out.println(st);
        }
        Iterator itera = vector.iterator();
        while (itera.hasNext()) {
            Integer num = (Integer) itera.next();
            System.out.println(num);
        }
    }

}
