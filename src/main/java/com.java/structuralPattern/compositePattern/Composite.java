package com.java.structuralPattern.compositePattern;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 上午10:56
 */
public class Composite implements Component {
    private Vector componentVector = new Vector();
    /**
     * 返回自己的实例
     */
    public Composite getComposite() {
        return this;
    }
    /**
     * 某个商业方法
     */
    public void sampleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) enumeration.nextElement()).sampleOperation();
        }
    }

    /**
     * 聚集管理方法，增加夜歌子构件对象
     */
    public void add(Component component) {
        componentVector.addElement(component);
    }

    /**
     * 聚集管理方法，删除一个子构件对象
     */
    public void remove(Component component) {
        componentVector.removeElement(component);
    }

    /**
     * 聚集管理方法，返还聚集的Enumeration对象
     */
    public Enumeration components() {
        return componentVector.elements();
    }
}
