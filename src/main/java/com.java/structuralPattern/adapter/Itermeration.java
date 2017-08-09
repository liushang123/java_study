package com.java.structuralPattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-28 下午3:48
 */
public class Itermeration implements Enumeration {
    private Iterator it;

    public Itermeration(Iterator it) {
        this.it = it;
    }

    public boolean hasMoreElements() {
        return it.hasNext();
    }

    public Object nextElement() throws NoSuchElementException {
        return it.next();
    }
}
