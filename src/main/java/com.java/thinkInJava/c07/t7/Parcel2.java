package com.java.thinkInJava.c07.t7;

import java.util.*;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 上午10:06
 */
public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents cont() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = cont();
        Destination d = to(dest);
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tanzania");
        Parcel2 q = new Parcel2();
        Contents c = q.cont();
        Destination d = q.to("Borneo");
        Set<Integer> aSet = new HashSet<Integer>();
        aSet.add(1);
        HashSet<String> a = new HashSet<String>();
        a.add("aaa");
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);

    }
}
