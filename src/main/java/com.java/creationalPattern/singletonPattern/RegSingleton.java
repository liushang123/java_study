package com.java.creationalPattern.singletonPattern;
/**
 * Created by Intellij IDEA
 * Author: lizhiyong
 * E-mail: lizhiyong@xiaomi.com
 * Time: 17-2-24 下午2:15
 */

import java.util.HashMap;

/**
 * 登记式单例模式 解决了饿汉式和懒汉式 不能被继承的问题，但是子类实例化的方式只能是懒汉式
 */
public class RegSingleton {
    private static HashMap m_registry = new HashMap();

    static {
        RegSingleton x = new RegSingleton();
        m_registry.put(x.getClass().getName(), x);
    }

    protected RegSingleton() {

    }

    public static RegSingleton getInstance(String name) {
        if (name == null) {
            name = "com.java.patterns.singletonPattern.RegSingleton";
        }
        if (m_registry.get(name) == null) {
            try {
                m_registry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                System.out.println("Error happened");
            }
        }
        return (RegSingleton) (m_registry.get(name));
    }
}
