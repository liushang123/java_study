package com.java.creationalPattern.multitonPattern;

import java.util.Date;
import java.util.Random;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-27 下午2:11
 */
public class Die {
    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private Die() {

    }

    public static Die getInstance(int whichOne) {
        if (whichOne == 1) {
            return die1;
        } else {
            return die2;
        }
    }

    public synchronized int dice() {
        Date d = new Date();
        Random r = new Random(d.getTime());
        int value = r.nextInt();
        value = Math.abs(value);
        value = value % 6 + 1;
        return value;
    }

    public static void main(String[] args) {
        Die myDie1, myDie2;
        myDie1 = Die.getInstance(1);
        myDie2 = Die.getInstance(2);
        System.out.println(myDie1.dice());
        System.out.println(myDie2.dice());
    }
}
