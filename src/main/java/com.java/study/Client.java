package com.java.study;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-13 上午11:18
 */
public class Client {
    public static void main(String[] args) {
        Email email = new Email("请于今天12:30到二会议室参加会议。。。");
        Object a;

        Person person1 = new Person("zhangsan", email);

        Person person2 = CloneUtils.clone(person1);
        person2.setName("lisi");

        Person person3 = CloneUtils.clone(person1);
        person3.setName("wangwu");
        person3.getEmail().setSubject("请于今天12:00到二会议室参加会议。。。");

        System.out.println(person1.getName() + "的邮件内容是：" + person1.getEmail().getSubject());
        System.out.println(person2.getName() + "的邮件内容是：" + person2.getEmail().getSubject());
        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getSubject());
    }
}
