package com.java.structuralPattern.proxyPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午1:54
 */
public class UsageLogger {
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void save() {
        System.out.println("save!");
    }

    public void save(String userId) {
        this.userId = userId;
        save();
    }
}
