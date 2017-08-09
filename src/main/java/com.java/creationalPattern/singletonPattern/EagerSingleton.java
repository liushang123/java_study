package com.java.creationalPattern.singletonPattern;/**
                                                    * Created by Intellij IDEA
                                                    * Author: lizhiyong
                                                    * E-mail: lizhiyong@xiaomi.com
                                                    * Time: 17-2-24 下午2:03
                                                    */

/**
 * 饿汉式单例模式 关键是：构造函数私有化，避免了外界利用构造函数创建实例， 由于构造函数的私有化导致此类不能被继承
 */
public class EagerSingleton {
    private static final EagerSingleton m_instance = new EagerSingleton();

    private EagerSingleton() {

    }
    public static EagerSingleton getInstance() {
        return m_instance;
    }
}
