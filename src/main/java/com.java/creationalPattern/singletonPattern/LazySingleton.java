package com.java.creationalPattern.singletonPattern;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 下午2:09
 */

/**
 * 懒汉式单例模式
 */
public class LazySingleton {
    private static LazySingleton m_instance = null;
    private LazySingleton() {
    }
    synchronized public static LazySingleton getInstance() {
        if (m_instance == null) {
            m_instance = new LazySingleton();
        }
        return m_instance;
    }
}
