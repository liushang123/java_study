package com.java.creationalPattern.multitonPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-27 下午3:47
 */
public class KeyGenerator {
    /**
     * 无数据库情况
     *
     *
     * private static KeyGenerator keygen = new KeyGenerator(); private int key
     * = 100;
     * 
     * private KeyGenerator() {
     * 
     * } public static KeyGenerator getInstance() { return keygen; }
     * 
     * public synchronized int getNextKey() { return key++; }
     */
    /**
     * 有数据库的情况
     */
    private static KeyGenerator keygen = new KeyGenerator();

    private KeyGenerator() {

    }

    public static KeyGenerator getInstance() {
        return keygen;
    }

    public synchronized int getNextKey() {
        return getNextKeyFromDB();
    }

    public int getNextKeyFromDB() {
        String sql1 = "UPDATE KeyTable SET keyValue = keyValue+1";
        String sql2 = "SELECT keyValue FROM KeyTable";
        return 1000;
    }
}
