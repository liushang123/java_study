package com.java.creationalPattern.prototypePattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午1:21
 */
public class Client {
    private PrototypeManager mgr;
    private Prototype prototype;

    public void registerPrototype() {
        prototype = new ConcretePrototype();
        Prototype copyType = (Prototype) prototype.clone();
        mgr.add(copyType);
    }

}
