package com.java.structuralPattern.proxyPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午1:53
 */
public class AccessValidator {
    public boolean vaidateUser(String userId) {
        if (userId.equals("Admin")) {
            return true;
        } else {
            return false;
        }
    }
}
