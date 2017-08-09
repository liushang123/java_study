package com.java.structuralPattern.compositePattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 上午10:53
 */
public interface Component {
    /**
     * 返还自己的实例
     */
    Composite getComposite();
    /**
     * 某个商业方法
     */
    void sampleOperation();
}
