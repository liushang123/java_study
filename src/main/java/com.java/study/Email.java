package com.java.study;

import java.io.Serializable;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-13 上午11:12
 */
public class Email implements Serializable {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    Email(String subject) {
        setSubject(subject);
    }
}
